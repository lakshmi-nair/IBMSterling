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
@XmlRootElement(name = "WorkOrder")
public class WorkOrder {

    @XmlAttribute(name = "QuantityCompleted")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantityCompleted;
    @XmlAttribute(name = "QuantityRemoved")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantityRemoved;
    @XmlAttribute(name = "QuantityRequested")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantityRequested;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "WorkOrderKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String workOrderKey;
    @XmlAttribute(name = "WorkOrderNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String workOrderNo;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the quantityCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityCompleted() {
        return quantityCompleted;
    }

    /**
     * Sets the value of the quantityCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityCompleted(String value) {
        this.quantityCompleted = value;
    }

    /**
     * Gets the value of the quantityRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityRemoved() {
        return quantityRemoved;
    }

    /**
     * Sets the value of the quantityRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityRemoved(String value) {
        this.quantityRemoved = value;
    }

    /**
     * Gets the value of the quantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityRequested(String value) {
        this.quantityRequested = value;
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
     * Gets the value of the workOrderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderKey() {
        return workOrderKey;
    }

    /**
     * Sets the value of the workOrderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderKey(String value) {
        this.workOrderKey = value;
    }

    /**
     * Gets the value of the workOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNo() {
        return workOrderNo;
    }

    /**
     * Sets the value of the workOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNo(String value) {
        this.workOrderNo = value;
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