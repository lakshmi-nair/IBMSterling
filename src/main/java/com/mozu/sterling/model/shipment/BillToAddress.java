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
@XmlRootElement(name = "BillToAddress")
public class BillToAddress {

    @XmlAttribute(name = "AddressLine1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine1;
    @XmlAttribute(name = "AddressLine2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine2;
    @XmlAttribute(name = "AddressLine3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine3;
    @XmlAttribute(name = "AddressLine4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine4;
    @XmlAttribute(name = "AddressLine5")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine5;
    @XmlAttribute(name = "AddressLine6")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addressLine6;
    @XmlAttribute(name = "AlternateEmailID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alternateEmailID;
    @XmlAttribute(name = "Beeper")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String beeper;
    @XmlAttribute(name = "City")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String city;
    @XmlAttribute(name = "Company")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String company;
    @XmlAttribute(name = "Country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "DayFaxNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dayFaxNo;
    @XmlAttribute(name = "DayPhone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dayPhone;
    @XmlAttribute(name = "Department")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String department;
    @XmlAttribute(name = "EMailID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eMailID;
    @XmlAttribute(name = "ErrorTxt")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String errorTxt;
    @XmlAttribute(name = "EveningFaxNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eveningFaxNo;
    @XmlAttribute(name = "EveningPhone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eveningPhone;
    @XmlAttribute(name = "FirstName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String firstName;
    @XmlAttribute(name = "HttpUrl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String httpUrl;
    @XmlAttribute(name = "IsCommercialAddress")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isCommercialAddress;
    @XmlAttribute(name = "JobTitle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String jobTitle;
    @XmlAttribute(name = "LastName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lastName;
    @XmlAttribute(name = "MiddleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String middleName;
    @XmlAttribute(name = "MobilePhone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mobilePhone;
    @XmlAttribute(name = "OtherPhone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String otherPhone;
    @XmlAttribute(name = "PersonID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String personID;
    @XmlAttribute(name = "PersonInfoKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String personInfoKey;
    @XmlAttribute(name = "PreferredShipAddress")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String preferredShipAddress;
    @XmlAttribute(name = "State")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String state;
    @XmlAttribute(name = "Suffix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String suffix;
    @XmlAttribute(name = "TaxGeoCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxGeoCode;
    @XmlAttribute(name = "Title")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String title;
    @XmlAttribute(name = "UseCount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String useCount;
    @XmlAttribute(name = "VerificationStatus")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String verificationStatus;
    @XmlAttribute(name = "ZipCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String zipCode;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the addressLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine6() {
        return addressLine6;
    }

    /**
     * Sets the value of the addressLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine6(String value) {
        this.addressLine6 = value;
    }

    /**
     * Gets the value of the alternateEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmailID() {
        return alternateEmailID;
    }

    /**
     * Sets the value of the alternateEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmailID(String value) {
        this.alternateEmailID = value;
    }

    /**
     * Gets the value of the beeper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeeper() {
        return beeper;
    }

    /**
     * Sets the value of the beeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeeper(String value) {
        this.beeper = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the dayFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayFaxNo() {
        return dayFaxNo;
    }

    /**
     * Sets the value of the dayFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayFaxNo(String value) {
        this.dayFaxNo = value;
    }

    /**
     * Gets the value of the dayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayPhone() {
        return dayPhone;
    }

    /**
     * Sets the value of the dayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayPhone(String value) {
        this.dayPhone = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the eMailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailID() {
        return eMailID;
    }

    /**
     * Sets the value of the eMailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailID(String value) {
        this.eMailID = value;
    }

    /**
     * Gets the value of the errorTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorTxt() {
        return errorTxt;
    }

    /**
     * Sets the value of the errorTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorTxt(String value) {
        this.errorTxt = value;
    }

    /**
     * Gets the value of the eveningFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEveningFaxNo() {
        return eveningFaxNo;
    }

    /**
     * Sets the value of the eveningFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEveningFaxNo(String value) {
        this.eveningFaxNo = value;
    }

    /**
     * Gets the value of the eveningPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEveningPhone() {
        return eveningPhone;
    }

    /**
     * Sets the value of the eveningPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEveningPhone(String value) {
        this.eveningPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the httpUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    /**
     * Sets the value of the httpUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpUrl(String value) {
        this.httpUrl = value;
    }

    /**
     * Gets the value of the isCommercialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCommercialAddress() {
        return isCommercialAddress;
    }

    /**
     * Sets the value of the isCommercialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCommercialAddress(String value) {
        this.isCommercialAddress = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the otherPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the value of the otherPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPhone(String value) {
        this.otherPhone = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    /**
     * Gets the value of the personInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonInfoKey() {
        return personInfoKey;
    }

    /**
     * Sets the value of the personInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonInfoKey(String value) {
        this.personInfoKey = value;
    }

    /**
     * Gets the value of the preferredShipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredShipAddress() {
        return preferredShipAddress;
    }

    /**
     * Sets the value of the preferredShipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredShipAddress(String value) {
        this.preferredShipAddress = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the taxGeoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGeoCode() {
        return taxGeoCode;
    }

    /**
     * Sets the value of the taxGeoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGeoCode(String value) {
        this.taxGeoCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the useCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCount() {
        return useCount;
    }

    /**
     * Sets the value of the useCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCount(String value) {
        this.useCount = value;
    }

    /**
     * Gets the value of the verificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the value of the verificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationStatus(String value) {
        this.verificationStatus = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
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
