//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.16 at 12:31:15 PM CDT 
//


package com.mozu.sterling.model.order;

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
    "scheduleTranQuantity"
})
@XmlRootElement(name = "Schedule")
public class Schedule {

    @XmlAttribute(name = "BatchNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String batchNo;
    @XmlAttribute(name = "ChangeInQuantity", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String changeInQuantity;
    @XmlAttribute(name = "LotNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotNumber;
    @XmlAttribute(name = "RevisionNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String revisionNo;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "ScheduleTranQuantity")
    protected ScheduleTranQuantity scheduleTranQuantity;

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the changeInQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeInQuantity() {
        return changeInQuantity;
    }

    /**
     * Sets the value of the changeInQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeInQuantity(String value) {
        this.changeInQuantity = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the revisionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNo() {
        return revisionNo;
    }

    /**
     * Sets the value of the revisionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNo(String value) {
        this.revisionNo = value;
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
     * Gets the value of the scheduleTranQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleTranQuantity }
     *     
     */
    public ScheduleTranQuantity getScheduleTranQuantity() {
        return scheduleTranQuantity;
    }

    /**
     * Sets the value of the scheduleTranQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleTranQuantity }
     *     
     */
    public void setScheduleTranQuantity(ScheduleTranQuantity value) {
        this.scheduleTranQuantity = value;
    }

}