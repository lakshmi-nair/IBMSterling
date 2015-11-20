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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Item")
public class Item {

    @XmlAttribute(name = "AlternateItemID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alternateItemID;
    @XmlAttribute(name = "BundleFulfillmentMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bundleFulfillmentMode;
    @XmlAttribute(name = "CostCurrency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String costCurrency;
    @XmlAttribute(name = "CountryOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String countryOfOrigin;
    @XmlAttribute(name = "CustomerItem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customerItem;
    @XmlAttribute(name = "CustomerItemDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customerItemDesc;
    @XmlAttribute(name = "ECCNNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eccnNo;
    @XmlAttribute(name = "HarmonizedCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harmonizedCode;
    @XmlAttribute(name = "ISBN")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isbn;
    @XmlAttribute(name = "ItemDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemDesc;
    @XmlAttribute(name = "ItemID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemID;
    @XmlAttribute(name = "ItemShortDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemShortDesc;
    @XmlAttribute(name = "ItemWeight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemWeight;
    @XmlAttribute(name = "ItemWeightUOM")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemWeightUOM;
    @XmlAttribute(name = "ManufacturerItem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerItem;
    @XmlAttribute(name = "ManufacturerItemDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerItemDesc;
    @XmlAttribute(name = "ManufacturerName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerName;
    @XmlAttribute(name = "NMFCClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nmfcClass;
    @XmlAttribute(name = "NMFCCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nmfcCode;
    @XmlAttribute(name = "NMFCDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nmfcDescription;
    @XmlAttribute(name = "ProductClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productClass;
    @XmlAttribute(name = "ProductLine")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productLine;
    @XmlAttribute(name = "ScheduleBCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scheduleBCode;
    @XmlAttribute(name = "SupplierItem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String supplierItem;
    @XmlAttribute(name = "SupplierItemDesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String supplierItemDesc;
    @XmlAttribute(name = "TaxProductCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxProductCode;
    @XmlAttribute(name = "UPCCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String upcCode;
    @XmlAttribute(name = "UnitCost")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unitCost;
    @XmlAttribute(name = "UnitOfMeasure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unitOfMeasure;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the alternateItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateItemID() {
        return alternateItemID;
    }

    /**
     * Sets the value of the alternateItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateItemID(String value) {
        this.alternateItemID = value;
    }

    /**
     * Gets the value of the bundleFulfillmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleFulfillmentMode() {
        return bundleFulfillmentMode;
    }

    /**
     * Sets the value of the bundleFulfillmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleFulfillmentMode(String value) {
        this.bundleFulfillmentMode = value;
    }

    /**
     * Gets the value of the costCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCurrency() {
        return costCurrency;
    }

    /**
     * Sets the value of the costCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCurrency(String value) {
        this.costCurrency = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the customerItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerItem() {
        return customerItem;
    }

    /**
     * Sets the value of the customerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerItem(String value) {
        this.customerItem = value;
    }

    /**
     * Gets the value of the customerItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerItemDesc() {
        return customerItemDesc;
    }

    /**
     * Sets the value of the customerItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerItemDesc(String value) {
        this.customerItemDesc = value;
    }

    /**
     * Gets the value of the eccnNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECCNNo() {
        return eccnNo;
    }

    /**
     * Sets the value of the eccnNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECCNNo(String value) {
        this.eccnNo = value;
    }

    /**
     * Gets the value of the harmonizedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * Sets the value of the harmonizedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemShortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShortDesc() {
        return itemShortDesc;
    }

    /**
     * Sets the value of the itemShortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShortDesc(String value) {
        this.itemShortDesc = value;
    }

    /**
     * Gets the value of the itemWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemWeight(String value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the itemWeightUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemWeightUOM() {
        return itemWeightUOM;
    }

    /**
     * Sets the value of the itemWeightUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemWeightUOM(String value) {
        this.itemWeightUOM = value;
    }

    /**
     * Gets the value of the manufacturerItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerItem() {
        return manufacturerItem;
    }

    /**
     * Sets the value of the manufacturerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerItem(String value) {
        this.manufacturerItem = value;
    }

    /**
     * Gets the value of the manufacturerItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerItemDesc() {
        return manufacturerItemDesc;
    }

    /**
     * Sets the value of the manufacturerItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerItemDesc(String value) {
        this.manufacturerItemDesc = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the nmfcClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMFCClass() {
        return nmfcClass;
    }

    /**
     * Sets the value of the nmfcClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMFCClass(String value) {
        this.nmfcClass = value;
    }

    /**
     * Gets the value of the nmfcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMFCCode() {
        return nmfcCode;
    }

    /**
     * Sets the value of the nmfcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMFCCode(String value) {
        this.nmfcCode = value;
    }

    /**
     * Gets the value of the nmfcDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMFCDescription() {
        return nmfcDescription;
    }

    /**
     * Sets the value of the nmfcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMFCDescription(String value) {
        this.nmfcDescription = value;
    }

    /**
     * Gets the value of the productClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * Sets the value of the productClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClass(String value) {
        this.productClass = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the scheduleBCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * Sets the value of the scheduleBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleBCode(String value) {
        this.scheduleBCode = value;
    }

    /**
     * Gets the value of the supplierItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierItem() {
        return supplierItem;
    }

    /**
     * Sets the value of the supplierItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierItem(String value) {
        this.supplierItem = value;
    }

    /**
     * Gets the value of the supplierItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierItemDesc() {
        return supplierItemDesc;
    }

    /**
     * Sets the value of the supplierItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierItemDesc(String value) {
        this.supplierItemDesc = value;
    }

    /**
     * Gets the value of the taxProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProductCode() {
        return taxProductCode;
    }

    /**
     * Sets the value of the taxProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProductCode(String value) {
        this.taxProductCode = value;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCCode() {
        return upcCode;
    }

    /**
     * Sets the value of the upcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCCode(String value) {
        this.upcCode = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCost(String value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
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