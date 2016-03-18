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
    "chargeTransactionDetail"
})
@XmlRootElement(name = "ChargeTransactionDetails")
public class ChargeTransactionDetails {

    @XmlAttribute(name = "AdditionalExpectedAuthorizations")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String additionalExpectedAuthorizations;
    @XmlAttribute(name = "RemainingAmountToAuth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String remainingAmountToAuth;
    @XmlAttribute(name = "TotalCredits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalCredits;
    @XmlAttribute(name = "TotalDebits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalDebits;
    @XmlAttribute(name = "TotalOpenAuthorizations")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalOpenAuthorizations;
    @XmlAttribute(name = "TotalOpenBookings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalOpenBookings;
    @XmlAttribute(name = "TotalTransferredIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalTransferredIn;
    @XmlAttribute(name = "TotalTransferredOut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalTransferredOut;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "ChargeTransactionDetail")
    protected List<ChargeTransactionDetail> chargeTransactionDetail;

    /**
     * Gets the value of the additionalExpectedAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalExpectedAuthorizations() {
        return additionalExpectedAuthorizations;
    }

    /**
     * Sets the value of the additionalExpectedAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalExpectedAuthorizations(String value) {
        this.additionalExpectedAuthorizations = value;
    }

    /**
     * Gets the value of the remainingAmountToAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingAmountToAuth() {
        return remainingAmountToAuth;
    }

    /**
     * Sets the value of the remainingAmountToAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingAmountToAuth(String value) {
        this.remainingAmountToAuth = value;
    }

    /**
     * Gets the value of the totalCredits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCredits() {
        return totalCredits;
    }

    /**
     * Sets the value of the totalCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCredits(String value) {
        this.totalCredits = value;
    }

    /**
     * Gets the value of the totalDebits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDebits() {
        return totalDebits;
    }

    /**
     * Sets the value of the totalDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDebits(String value) {
        this.totalDebits = value;
    }

    /**
     * Gets the value of the totalOpenAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOpenAuthorizations() {
        return totalOpenAuthorizations;
    }

    /**
     * Sets the value of the totalOpenAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOpenAuthorizations(String value) {
        this.totalOpenAuthorizations = value;
    }

    /**
     * Gets the value of the totalOpenBookings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOpenBookings() {
        return totalOpenBookings;
    }

    /**
     * Sets the value of the totalOpenBookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOpenBookings(String value) {
        this.totalOpenBookings = value;
    }

    /**
     * Gets the value of the totalTransferredIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTransferredIn() {
        return totalTransferredIn;
    }

    /**
     * Sets the value of the totalTransferredIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTransferredIn(String value) {
        this.totalTransferredIn = value;
    }

    /**
     * Gets the value of the totalTransferredOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTransferredOut() {
        return totalTransferredOut;
    }

    /**
     * Sets the value of the totalTransferredOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTransferredOut(String value) {
        this.totalTransferredOut = value;
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
     * Gets the value of the chargeTransactionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeTransactionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeTransactionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeTransactionDetail }
     * 
     * 
     */
    public List<ChargeTransactionDetail> getChargeTransactionDetail() {
        if (chargeTransactionDetail == null) {
            chargeTransactionDetail = new ArrayList<ChargeTransactionDetail>();
        }
        return this.chargeTransactionDetail;
    }

}
