//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

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
@XmlRootElement(name = "PricingRulePricelistExclusion")
public class PricingRulePricelistExclusion {

    @XmlAttribute(name = "PricelistHeaderKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricelistHeaderKey;
    @XmlAttribute(name = "PricingRuleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRuleKey;
    @XmlAttribute(name = "PricingRulePricelistExclusionKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRulePricelistExclusionKey;

    /**
     * Gets the value of the pricelistHeaderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricelistHeaderKey() {
        return pricelistHeaderKey;
    }

    /**
     * Sets the value of the pricelistHeaderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricelistHeaderKey(String value) {
        this.pricelistHeaderKey = value;
    }

    /**
     * Gets the value of the pricingRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRuleKey() {
        return pricingRuleKey;
    }

    /**
     * Sets the value of the pricingRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRuleKey(String value) {
        this.pricingRuleKey = value;
    }

    /**
     * Gets the value of the pricingRulePricelistExclusionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRulePricelistExclusionKey() {
        return pricingRulePricelistExclusionKey;
    }

    /**
     * Sets the value of the pricingRulePricelistExclusionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRulePricelistExclusionKey(String value) {
        this.pricingRulePricelistExclusionKey = value;
    }

}
