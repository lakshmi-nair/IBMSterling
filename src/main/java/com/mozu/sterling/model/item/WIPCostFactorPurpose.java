//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.25 at 10:42:12 AM CST 
//


package com.mozu.sterling.model.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "WIPCostFactorPurpose")
public class WIPCostFactorPurpose {

    @XmlAttribute(name = "CostFactorGroupKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String costFactorGroupKey;
    @XmlAttribute(name = "CostFactorGroupName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String costFactorGroupName;

    /**
     * Gets the value of the costFactorGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostFactorGroupKey() {
        return costFactorGroupKey;
    }

    /**
     * Sets the value of the costFactorGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostFactorGroupKey(String value) {
        this.costFactorGroupKey = value;
    }

    /**
     * Gets the value of the costFactorGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostFactorGroupName() {
        return costFactorGroupName;
    }

    /**
     * Sets the value of the costFactorGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostFactorGroupName(String value) {
        this.costFactorGroupName = value;
    }

}
