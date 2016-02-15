//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.02.09 at 04:46:29 PM CST
//


package com.mozu.sterling.model.inventory;

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
@XmlRootElement(name = "AssignedValue")
public class AssignedValue {

    @XmlAttribute(name = "DoubleValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String doubleValue;
    @XmlAttribute(name = "IntegerValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String integerValue;
    @XmlAttribute(name = "IsInherited")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isInherited;
    @XmlAttribute(name = "LongDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String longDescription;
    @XmlAttribute(name = "SequenceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequenceNo;
    @XmlAttribute(name = "ShortDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortDescription;
    @XmlAttribute(name = "Value")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the doubleValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDoubleValue() {
        return doubleValue;
    }

    /**
     * Sets the value of the doubleValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDoubleValue(String value) {
        this.doubleValue = value;
    }

    /**
     * Gets the value of the integerValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntegerValue(String value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the isInherited property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsInherited() {
        return isInherited;
    }

    /**
     * Sets the value of the isInherited property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsInherited(String value) {
        this.isInherited = value;
    }

    /**
     * Gets the value of the longDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the shortDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
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