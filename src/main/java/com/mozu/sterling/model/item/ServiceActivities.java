//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.25 at 10:42:12 AM CST 
//


package com.mozu.sterling.model.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceActivity"
})
@XmlRootElement(name = "ServiceActivities")
public class ServiceActivities {

    @XmlElement(name = "ServiceActivity")
    protected List<ServiceActivity> serviceActivity;

    /**
     * Gets the value of the serviceActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceActivity }
     * 
     * 
     */
    public List<ServiceActivity> getServiceActivity() {
        if (serviceActivity == null) {
            serviceActivity = new ArrayList<ServiceActivity>();
        }
        return this.serviceActivity;
    }

}
