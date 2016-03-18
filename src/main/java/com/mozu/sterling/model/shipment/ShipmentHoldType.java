//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shipmentHoldTypeLogs"
})
@XmlRootElement(name = "ShipmentHoldType")
public class ShipmentHoldType {

    @XmlAttribute(name = "HoldType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String holdType;
    @XmlAttribute(name = "LastHoldTypeDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lastHoldTypeDate;
    @XmlAttribute(name = "ReasonText")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reasonText;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "TransactionId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transactionId;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "ShipmentHoldTypeLogs")
    protected ShipmentHoldTypeLogs shipmentHoldTypeLogs;

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldType(String value) {
        this.holdType = value;
    }

    /**
     * Gets the value of the lastHoldTypeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastHoldTypeDate() {
        return lastHoldTypeDate;
    }

    /**
     * Sets the value of the lastHoldTypeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastHoldTypeDate(String value) {
        this.lastHoldTypeDate = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the aDtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aDtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADtype() {
        if (aDtype == null) {
            aDtype = new ArrayList<String>();
        }
        return this.aDtype;
    }

    /**
     * Gets the value of the shipmentHoldTypeLogs property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentHoldTypeLogs }
     *     
     */
    public ShipmentHoldTypeLogs getShipmentHoldTypeLogs() {
        return shipmentHoldTypeLogs;
    }

    /**
     * Sets the value of the shipmentHoldTypeLogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentHoldTypeLogs }
     *     
     */
    public void setShipmentHoldTypeLogs(ShipmentHoldTypeLogs value) {
        this.shipmentHoldTypeLogs = value;
    }

}
