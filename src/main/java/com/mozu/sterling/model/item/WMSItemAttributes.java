//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.25 at 10:42:12 AM CST 
//


package com.mozu.sterling.model.item;

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
@XmlRootElement(name = "WMSItemAttributes")
public class WMSItemAttributes {

    @XmlAttribute(name = "ConstrainedByHeight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String constrainedByHeight;
    @XmlAttribute(name = "Deformable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deformable;
    @XmlAttribute(name = "PackByVolume")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String packByVolume;
    @XmlAttribute(name = "PackedHeight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String packedHeight;
    @XmlAttribute(name = "PackedLength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String packedLength;
    @XmlAttribute(name = "PackedWidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String packedWidth;
    @XmlAttribute(name = "StackHeightIncrease")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stackHeightIncrease;
    @XmlAttribute(name = "Stackable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stackable;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the constrainedByHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrainedByHeight() {
        return constrainedByHeight;
    }

    /**
     * Sets the value of the constrainedByHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrainedByHeight(String value) {
        this.constrainedByHeight = value;
    }

    /**
     * Gets the value of the deformable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeformable() {
        return deformable;
    }

    /**
     * Sets the value of the deformable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeformable(String value) {
        this.deformable = value;
    }

    /**
     * Gets the value of the packByVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackByVolume() {
        return packByVolume;
    }

    /**
     * Sets the value of the packByVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackByVolume(String value) {
        this.packByVolume = value;
    }

    /**
     * Gets the value of the packedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackedHeight() {
        return packedHeight;
    }

    /**
     * Sets the value of the packedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackedHeight(String value) {
        this.packedHeight = value;
    }

    /**
     * Gets the value of the packedLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackedLength() {
        return packedLength;
    }

    /**
     * Sets the value of the packedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackedLength(String value) {
        this.packedLength = value;
    }

    /**
     * Gets the value of the packedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackedWidth() {
        return packedWidth;
    }

    /**
     * Sets the value of the packedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackedWidth(String value) {
        this.packedWidth = value;
    }

    /**
     * Gets the value of the stackHeightIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackHeightIncrease() {
        return stackHeightIncrease;
    }

    /**
     * Sets the value of the stackHeightIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackHeightIncrease(String value) {
        this.stackHeightIncrease = value;
    }

    /**
     * Gets the value of the stackable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackable() {
        return stackable;
    }

    /**
     * Sets the value of the stackable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackable(String value) {
        this.stackable = value;
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
