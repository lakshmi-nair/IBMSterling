//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.31 at 01:35:41 PM CST 
//


package com.mozu.sterling.model.order;

import java.util.ArrayList;
import java.util.List;
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
@XmlRootElement(name = "PricingRuleAction")
public class PricingRuleAction {

    @XmlAttribute(name = "Adjustment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String adjustment;
    @XmlAttribute(name = "AdjustmentType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String adjustmentType;
    @XmlAttribute(name = "ApplyAdjustmentToRemainder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String applyAdjustmentToRemainder;
    @XmlAttribute(name = "ChargeCategory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeCategory;
    @XmlAttribute(name = "ChargeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeName;
    @XmlAttribute(name = "MaxAbsoluteAdjustment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxAbsoluteAdjustment;
    @XmlAttribute(name = "MaximumManualAdjustment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maximumManualAdjustment;
    @XmlAttribute(name = "OrderTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderTotal;
    @XmlAttribute(name = "PricingRuleActionKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRuleActionKey;
    @XmlAttribute(name = "PricingRuleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRuleKey;
    @XmlAttribute(name = "QualifierAmount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String qualifierAmount;
    @XmlAttribute(name = "QualifierAmountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String qualifierAmountType;
    @XmlAttribute(name = "Quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;
    @XmlAttribute(name = "Reference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reference;
    @XmlAttribute(name = "TargetItemDeterminationRule")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetItemDeterminationRule;
    @XmlAttribute(name = "TargetOccurrenceLimit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetOccurrenceLimit;
    @XmlAttribute(name = "WhenToApply")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String whenToApply;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustment(String value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the applyAdjustmentToRemainder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyAdjustmentToRemainder() {
        return applyAdjustmentToRemainder;
    }

    /**
     * Sets the value of the applyAdjustmentToRemainder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyAdjustmentToRemainder(String value) {
        this.applyAdjustmentToRemainder = value;
    }

    /**
     * Gets the value of the chargeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * Sets the value of the chargeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCategory(String value) {
        this.chargeCategory = value;
    }

    /**
     * Gets the value of the chargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * Sets the value of the chargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeName(String value) {
        this.chargeName = value;
    }

    /**
     * Gets the value of the maxAbsoluteAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAbsoluteAdjustment() {
        return maxAbsoluteAdjustment;
    }

    /**
     * Sets the value of the maxAbsoluteAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAbsoluteAdjustment(String value) {
        this.maxAbsoluteAdjustment = value;
    }

    /**
     * Gets the value of the maximumManualAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumManualAdjustment() {
        return maximumManualAdjustment;
    }

    /**
     * Sets the value of the maximumManualAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumManualAdjustment(String value) {
        this.maximumManualAdjustment = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTotal(String value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the pricingRuleActionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRuleActionKey() {
        return pricingRuleActionKey;
    }

    /**
     * Sets the value of the pricingRuleActionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRuleActionKey(String value) {
        this.pricingRuleActionKey = value;
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
     * Gets the value of the qualifierAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierAmount() {
        return qualifierAmount;
    }

    /**
     * Sets the value of the qualifierAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierAmount(String value) {
        this.qualifierAmount = value;
    }

    /**
     * Gets the value of the qualifierAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierAmountType() {
        return qualifierAmountType;
    }

    /**
     * Sets the value of the qualifierAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierAmountType(String value) {
        this.qualifierAmountType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the targetItemDeterminationRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetItemDeterminationRule() {
        return targetItemDeterminationRule;
    }

    /**
     * Sets the value of the targetItemDeterminationRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetItemDeterminationRule(String value) {
        this.targetItemDeterminationRule = value;
    }

    /**
     * Gets the value of the targetOccurrenceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOccurrenceLimit() {
        return targetOccurrenceLimit;
    }

    /**
     * Sets the value of the targetOccurrenceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOccurrenceLimit(String value) {
        this.targetOccurrenceLimit = value;
    }

    /**
     * Gets the value of the whenToApply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhenToApply() {
        return whenToApply;
    }

    /**
     * Sets the value of the whenToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhenToApply(String value) {
        this.whenToApply = value;
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

}