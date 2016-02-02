package com.mozu.sterling.jmsUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.stereotype.Component;

import com.ibm.websphere.sib.api.jms.JmsConnectionFactory;
import com.ibm.websphere.sib.api.jms.JmsFactoryFactory;
import com.mozu.sterling.handler.ConfigHandler;
import com.mozu.sterling.model.Setting;
import com.mozu.sterling.service.NewSterlingToMozuOrderMessageListener;
import com.mozu.sterling.service.OrderService;
import com.mozu.sterling.service.UpdateSterlingToMozuOrderMessageListener;

/**
 * In the simplest websphere install, it has a default message queue provider
 * that is accessed directly by a known provider endpoint. Uses SIB jars.
 *
 */
@Component(value = "directJmsStrategy")
public class DirectWebsphereJmsStrategy implements JmsConnectionStrategy {
	@Autowired
	private OrderService orderService;
	@Autowired
	private ConfigHandler configHandler;

	@Override
	public JmsResourceSetting getJmsResourceSettings(Setting setting,
			Integer tenantId) throws JMSException {
		JmsResourceSetting jmsResourceSetting = new JmsResourceSetting();

		jmsResourceSetting.setDestinationType(DestinationTypeEnum.from(setting
				.getDestinationType()));

		jmsResourceSetting.setConnectionFactory(getConnectionFactory(setting));
		jmsResourceSetting
				.setCreateOrderDestination(getCreateOrderDestination(setting));
		jmsResourceSetting
				.setUpdateOrderDestination(getUpdateOrderDestination(setting));

		jmsResourceSetting
				.setCreateOrderMessageListener(new NewSterlingToMozuOrderMessageListener(
						tenantId, configHandler, orderService));
		jmsResourceSetting
				.setUpdateOrderMessageListener(new UpdateSterlingToMozuOrderMessageListener(
						tenantId, configHandler, orderService));

		return jmsResourceSetting;
	}

	protected ConnectionFactory getConnectionFactory(Setting setting)
			throws JMSException {

		JmsFactoryFactory jmsFactoryFactory = JmsFactoryFactory.getInstance();
		JmsConnectionFactory connectionFactory = jmsFactoryFactory
				.createConnectionFactory();
		connectionFactory.setProviderEndpoints(setting.getProviderEndpoint());
		connectionFactory.setBusName(setting.getBusName());
		connectionFactory.setDurableSubscriptionHome("smcfs94Node01.server1-mozuJMS");

		// ClientId set for durable subscriber
		if (DestinationTypeEnum.TOPIC == DestinationTypeEnum.from(setting.getDestinationType())) {
			connectionFactory.setClientID(getJmsClientId());
		}

		return new SingleConnectionFactory(connectionFactory);
	}

	protected Destination getCreateOrderDestination(Setting setting)
			throws JMSException {
		return createDestination(setting.getCreateOrderDestinationName(),
				DestinationTypeEnum.from(setting.getDestinationType()));
	}

	protected Destination getUpdateOrderDestination(Setting setting)
			throws JMSException {
		return createDestination(setting.getUpdateOrderDestinationName(),
				DestinationTypeEnum.from(setting.getDestinationType()));
	}

	protected Destination createDestination(String destinationName,
			DestinationTypeEnum destinationType) throws JMSException {
		JmsFactoryFactory jmsFactoryFactory = JmsFactoryFactory.getInstance();

		Destination destination = null;

		switch (destinationType) {
		case QUEUE:
			destination = jmsFactoryFactory.createQueue(destinationName);
			break;
		case TOPIC:
			destination = jmsFactoryFactory.createTopic(destinationName);
			break;
		}

		return destination;
	}

	protected String getJmsClientId() {
		String clientId = null;
		try {
			clientId = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			clientId = "unknownhost";
		}

		return clientId;
	}
}