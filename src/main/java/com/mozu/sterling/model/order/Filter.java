//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.31 at 01:35:41 PM CST 
//


package com.mozu.sterling.model.order;

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
    "remainingFinancialTotals"
})
@XmlRootElement(name = "Filter")
public class Filter {

    @XmlAttribute(name = "InPerson")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inPerson;
    @XmlElement(name = "RemainingFinancialTotals")
    protected RemainingFinancialTotals remainingFinancialTotals;

    /**
     * Gets the value of the inPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPerson() {
        return inPerson;
    }

    /**
     * Sets the value of the inPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPerson(String value) {
        this.inPerson = value;
    }

    /**
     * Gets the value of the remainingFinancialTotals property.
     * 
     * @return
     *     possible object is
     *     {@link RemainingFinancialTotals }
     *     
     */
    public RemainingFinancialTotals getRemainingFinancialTotals() {
        return remainingFinancialTotals;
    }

    /**
     * Sets the value of the remainingFinancialTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemainingFinancialTotals }
     *     
     */
    public void setRemainingFinancialTotals(RemainingFinancialTotals value) {
        this.remainingFinancialTotals = value;
    }

}