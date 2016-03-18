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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OverallTotalsInEnterpriseCurrency")
public class OverallTotalsInEnterpriseCurrency {

    @XmlAttribute(name = "AdditionalLinePriceTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String additionalLinePriceTotal;
    @XmlAttribute(name = "GrandCharges")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grandCharges;
    @XmlAttribute(name = "GrandDiscount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grandDiscount;
    @XmlAttribute(name = "GrandTax")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grandTax;
    @XmlAttribute(name = "GrandTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grandTotal;
    @XmlAttribute(name = "HdrCharges")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hdrCharges;
    @XmlAttribute(name = "HdrDiscount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hdrDiscount;
    @XmlAttribute(name = "HdrTax")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hdrTax;
    @XmlAttribute(name = "HdrTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hdrTotal;
    @XmlAttribute(name = "LineSubTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lineSubTotal;
    @XmlAttribute(name = "RecurringAdditionalLinePriceTotal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recurringAdditionalLinePriceTotal;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the additionalLinePriceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLinePriceTotal() {
        return additionalLinePriceTotal;
    }

    /**
     * Sets the value of the additionalLinePriceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLinePriceTotal(String value) {
        this.additionalLinePriceTotal = value;
    }

    /**
     * Gets the value of the grandCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandCharges() {
        return grandCharges;
    }

    /**
     * Sets the value of the grandCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandCharges(String value) {
        this.grandCharges = value;
    }

    /**
     * Gets the value of the grandDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandDiscount() {
        return grandDiscount;
    }

    /**
     * Sets the value of the grandDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandDiscount(String value) {
        this.grandDiscount = value;
    }

    /**
     * Gets the value of the grandTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTax() {
        return grandTax;
    }

    /**
     * Sets the value of the grandTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTax(String value) {
        this.grandTax = value;
    }

    /**
     * Gets the value of the grandTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * Sets the value of the grandTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotal(String value) {
        this.grandTotal = value;
    }

    /**
     * Gets the value of the hdrCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrCharges() {
        return hdrCharges;
    }

    /**
     * Sets the value of the hdrCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrCharges(String value) {
        this.hdrCharges = value;
    }

    /**
     * Gets the value of the hdrDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrDiscount() {
        return hdrDiscount;
    }

    /**
     * Sets the value of the hdrDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrDiscount(String value) {
        this.hdrDiscount = value;
    }

    /**
     * Gets the value of the hdrTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrTax() {
        return hdrTax;
    }

    /**
     * Sets the value of the hdrTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrTax(String value) {
        this.hdrTax = value;
    }

    /**
     * Gets the value of the hdrTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrTotal() {
        return hdrTotal;
    }

    /**
     * Sets the value of the hdrTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrTotal(String value) {
        this.hdrTotal = value;
    }

    /**
     * Gets the value of the lineSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSubTotal() {
        return lineSubTotal;
    }

    /**
     * Sets the value of the lineSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSubTotal(String value) {
        this.lineSubTotal = value;
    }

    /**
     * Gets the value of the recurringAdditionalLinePriceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringAdditionalLinePriceTotal() {
        return recurringAdditionalLinePriceTotal;
    }

    /**
     * Sets the value of the recurringAdditionalLinePriceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringAdditionalLinePriceTotal(String value) {
        this.recurringAdditionalLinePriceTotal = value;
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
