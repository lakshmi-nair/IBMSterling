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
@XmlRootElement(name = "DestinationLoad")
public class DestinationLoad {

    @XmlAttribute(name = "LoadKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String loadKey;
    @XmlAttribute(name = "LoadNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String loadNo;

    /**
     * Gets the value of the loadKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadKey() {
        return loadKey;
    }

    /**
     * Sets the value of the loadKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadKey(String value) {
        this.loadKey = value;
    }

    /**
     * Gets the value of the loadNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadNo() {
        return loadNo;
    }

    /**
     * Sets the value of the loadNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadNo(String value) {
        this.loadNo = value;
    }

}
