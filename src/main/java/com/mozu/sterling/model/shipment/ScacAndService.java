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
@XmlRootElement(name = "ScacAndService")
public class ScacAndService {

    @XmlAttribute(name = "CarrierServiceKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String carrierServiceKey;
    @XmlAttribute(name = "CarrierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String carrierType;
    @XmlAttribute(name = "DistancePerDay")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distancePerDay;
    @XmlAttribute(name = "DistanceUOM")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distanceUOM;
    @XmlAttribute(name = "ElectronicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String electronicCode;
    @XmlAttribute(name = "FixedTransitDays")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fixedTransitDays;
    @XmlAttribute(name = "HostCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hostCode;
    @XmlAttribute(name = "InternalReference1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalReference1;
    @XmlAttribute(name = "InternalReference2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalReference2;
    @XmlAttribute(name = "InternalReference3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalReference3;
    @XmlAttribute(name = "InternalReference4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalReference4;
    @XmlAttribute(name = "InternalReference5")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalReference5;
    @XmlAttribute(name = "InternationalShipping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internationalShipping;
    @XmlAttribute(name = "OrganizationCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String organizationCode;
    @XmlAttribute(name = "ScacAndService")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scacAndService;
    @XmlAttribute(name = "ScacAndServiceDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scacAndServiceDesc;
    @XmlAttribute(name = "ScacAndServiceKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scacAndServiceKey;
    @XmlAttribute(name = "ScacKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scacKey;
    @XmlAttribute(name = "ShipMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipMode;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the carrierServiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierServiceKey() {
        return carrierServiceKey;
    }

    /**
     * Sets the value of the carrierServiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierServiceKey(String value) {
        this.carrierServiceKey = value;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
    }

    /**
     * Gets the value of the distancePerDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistancePerDay() {
        return distancePerDay;
    }

    /**
     * Sets the value of the distancePerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistancePerDay(String value) {
        this.distancePerDay = value;
    }

    /**
     * Gets the value of the distanceUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUOM() {
        return distanceUOM;
    }

    /**
     * Sets the value of the distanceUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUOM(String value) {
        this.distanceUOM = value;
    }

    /**
     * Gets the value of the electronicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicCode() {
        return electronicCode;
    }

    /**
     * Sets the value of the electronicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicCode(String value) {
        this.electronicCode = value;
    }

    /**
     * Gets the value of the fixedTransitDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedTransitDays() {
        return fixedTransitDays;
    }

    /**
     * Sets the value of the fixedTransitDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedTransitDays(String value) {
        this.fixedTransitDays = value;
    }

    /**
     * Gets the value of the hostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCode() {
        return hostCode;
    }

    /**
     * Sets the value of the hostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCode(String value) {
        this.hostCode = value;
    }

    /**
     * Gets the value of the internalReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReference1() {
        return internalReference1;
    }

    /**
     * Sets the value of the internalReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReference1(String value) {
        this.internalReference1 = value;
    }

    /**
     * Gets the value of the internalReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReference2() {
        return internalReference2;
    }

    /**
     * Sets the value of the internalReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReference2(String value) {
        this.internalReference2 = value;
    }

    /**
     * Gets the value of the internalReference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReference3() {
        return internalReference3;
    }

    /**
     * Sets the value of the internalReference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReference3(String value) {
        this.internalReference3 = value;
    }

    /**
     * Gets the value of the internalReference4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReference4() {
        return internalReference4;
    }

    /**
     * Sets the value of the internalReference4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReference4(String value) {
        this.internalReference4 = value;
    }

    /**
     * Gets the value of the internalReference5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReference5() {
        return internalReference5;
    }

    /**
     * Sets the value of the internalReference5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReference5(String value) {
        this.internalReference5 = value;
    }

    /**
     * Gets the value of the internationalShipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalShipping() {
        return internationalShipping;
    }

    /**
     * Sets the value of the internationalShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalShipping(String value) {
        this.internationalShipping = value;
    }

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Gets the value of the scacAndService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScacAndService() {
        return scacAndService;
    }

    /**
     * Sets the value of the scacAndService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScacAndService(String value) {
        this.scacAndService = value;
    }

    /**
     * Gets the value of the scacAndServiceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScacAndServiceDesc() {
        return scacAndServiceDesc;
    }

    /**
     * Sets the value of the scacAndServiceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScacAndServiceDesc(String value) {
        this.scacAndServiceDesc = value;
    }

    /**
     * Gets the value of the scacAndServiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScacAndServiceKey() {
        return scacAndServiceKey;
    }

    /**
     * Sets the value of the scacAndServiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScacAndServiceKey(String value) {
        this.scacAndServiceKey = value;
    }

    /**
     * Gets the value of the scacKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScacKey() {
        return scacKey;
    }

    /**
     * Sets the value of the scacKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScacKey(String value) {
        this.scacKey = value;
    }

    /**
     * Gets the value of the shipMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMode() {
        return shipMode;
    }

    /**
     * Sets the value of the shipMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMode(String value) {
        this.shipMode = value;
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
