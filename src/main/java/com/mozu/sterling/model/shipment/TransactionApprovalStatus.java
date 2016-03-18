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
    "transactionViolation"
})
@XmlRootElement(name = "TransactionApprovalStatus")
public class TransactionApprovalStatus {

    @XmlAttribute(name = "ApproverComments")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverComments;
    @XmlAttribute(name = "ApproverSequence")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverSequence;
    @XmlAttribute(name = "ApproverUserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverUserID;
    @XmlAttribute(name = "IsMandatory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isMandatory;
    @XmlAttribute(name = "PreviousApproverSequence")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String previousApproverSequence;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "TransactionApprovalStatusKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transactionApprovalStatusKey;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "TransactionViolation")
    protected TransactionViolation transactionViolation;

    /**
     * Gets the value of the approverComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverComments() {
        return approverComments;
    }

    /**
     * Sets the value of the approverComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverComments(String value) {
        this.approverComments = value;
    }

    /**
     * Gets the value of the approverSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverSequence() {
        return approverSequence;
    }

    /**
     * Sets the value of the approverSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverSequence(String value) {
        this.approverSequence = value;
    }

    /**
     * Gets the value of the approverUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverUserID() {
        return approverUserID;
    }

    /**
     * Sets the value of the approverUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverUserID(String value) {
        this.approverUserID = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMandatory(String value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the previousApproverSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousApproverSequence() {
        return previousApproverSequence;
    }

    /**
     * Sets the value of the previousApproverSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousApproverSequence(String value) {
        this.previousApproverSequence = value;
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
     * Gets the value of the transactionApprovalStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionApprovalStatusKey() {
        return transactionApprovalStatusKey;
    }

    /**
     * Sets the value of the transactionApprovalStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionApprovalStatusKey(String value) {
        this.transactionApprovalStatusKey = value;
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
     * Gets the value of the transactionViolation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionViolation }
     *     
     */
    public TransactionViolation getTransactionViolation() {
        return transactionViolation;
    }

    /**
     * Sets the value of the transactionViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionViolation }
     *     
     */
    public void setTransactionViolation(TransactionViolation value) {
        this.transactionViolation = value;
    }

}
