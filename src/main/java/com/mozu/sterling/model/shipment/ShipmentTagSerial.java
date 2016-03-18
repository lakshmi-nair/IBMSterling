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
@XmlRootElement(name = "ShipmentTagSerial")
public class ShipmentTagSerial {

    @XmlAttribute(name = "BatchNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String batchNo;
    @XmlAttribute(name = "ContainerDetailKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String containerDetailKey;
    @XmlAttribute(name = "LotAttribute1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotAttribute1;
    @XmlAttribute(name = "LotAttribute2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotAttribute2;
    @XmlAttribute(name = "LotAttribute3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotAttribute3;
    @XmlAttribute(name = "LotKeyReference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotKeyReference;
    @XmlAttribute(name = "LotNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lotNumber;
    @XmlAttribute(name = "ManufacturingDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturingDate;
    @XmlAttribute(name = "Quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;
    @XmlAttribute(name = "RevisionNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String revisionNo;
    @XmlAttribute(name = "SerialNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String serialNo;
    @XmlAttribute(name = "ShipByDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipByDate;
    @XmlAttribute(name = "ShipmentLineKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipmentLineKey;
    @XmlAttribute(name = "ShipmentTagSerialKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipmentTagSerialKey;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

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
     * Gets the value of the containerDetailKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerDetailKey() {
        return containerDetailKey;
    }

    /**
     * Sets the value of the containerDetailKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerDetailKey(String value) {
        this.containerDetailKey = value;
    }

    /**
     * Gets the value of the lotAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttribute1() {
        return lotAttribute1;
    }

    /**
     * Sets the value of the lotAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttribute1(String value) {
        this.lotAttribute1 = value;
    }

    /**
     * Gets the value of the lotAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttribute2() {
        return lotAttribute2;
    }

    /**
     * Sets the value of the lotAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttribute2(String value) {
        this.lotAttribute2 = value;
    }

    /**
     * Gets the value of the lotAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttribute3() {
        return lotAttribute3;
    }

    /**
     * Sets the value of the lotAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttribute3(String value) {
        this.lotAttribute3 = value;
    }

    /**
     * Gets the value of the lotKeyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotKeyReference() {
        return lotKeyReference;
    }

    /**
     * Sets the value of the lotKeyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotKeyReference(String value) {
        this.lotKeyReference = value;
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
     * Gets the value of the manufacturingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDate() {
        return manufacturingDate;
    }

    /**
     * Sets the value of the manufacturingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDate(String value) {
        this.manufacturingDate = value;
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
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the shipByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipByDate() {
        return shipByDate;
    }

    /**
     * Sets the value of the shipByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipByDate(String value) {
        this.shipByDate = value;
    }

    /**
     * Gets the value of the shipmentLineKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentLineKey() {
        return shipmentLineKey;
    }

    /**
     * Sets the value of the shipmentLineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentLineKey(String value) {
        this.shipmentLineKey = value;
    }

    /**
     * Gets the value of the shipmentTagSerialKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTagSerialKey() {
        return shipmentTagSerialKey;
    }

    /**
     * Sets the value of the shipmentTagSerialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTagSerialKey(String value) {
        this.shipmentTagSerialKey = value;
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
