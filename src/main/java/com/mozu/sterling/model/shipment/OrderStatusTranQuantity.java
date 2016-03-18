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
@XmlRootElement(name = "OrderStatusTranQuantity")
public class OrderStatusTranQuantity {

    @XmlAttribute(name = "StatusQty")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String statusQty;
    @XmlAttribute(name = "TotalQuantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalQuantity;
    @XmlAttribute(name = "TransactionalUOM")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transactionalUOM;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the statusQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusQty() {
        return statusQty;
    }

    /**
     * Sets the value of the statusQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusQty(String value) {
        this.statusQty = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQuantity(String value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the transactionalUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalUOM() {
        return transactionalUOM;
    }

    /**
     * Sets the value of the transactionalUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalUOM(String value) {
        this.transactionalUOM = value;
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
