//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 05:53:09 PM IST 
//


package com.sanket.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used in REFRES
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Approved" type="{http://www.surescripts.com/messaging}ApprovedType"/>
 *         &lt;element name="Denied" type="{http://www.surescripts.com/messaging}DeniedType"/>
 *         &lt;element name="DeniedNewPrescriptionToFollow" type="{http://www.surescripts.com/messaging}DeniedNewRxToFollowType"/>
 *         &lt;element name="ApprovedWithChanges" type="{http://www.surescripts.com/messaging}ApprovedWithChangesType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "approved",
    "denied",
    "deniedNewPrescriptionToFollow",
    "approvedWithChanges"
})
public class ResponseType {

    @XmlElement(name = "Approved")
    protected ApprovedType approved;
    @XmlElement(name = "Denied")
    protected DeniedType denied;
    @XmlElement(name = "DeniedNewPrescriptionToFollow")
    protected DeniedNewRxToFollowType deniedNewPrescriptionToFollow;
    @XmlElement(name = "ApprovedWithChanges")
    protected ApprovedWithChangesType approvedWithChanges;

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovedType }
     *     
     */
    public ApprovedType getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovedType }
     *     
     */
    public void setApproved(ApprovedType value) {
        this.approved = value;
    }

    /**
     * Gets the value of the denied property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedType }
     *     
     */
    public DeniedType getDenied() {
        return denied;
    }

    /**
     * Sets the value of the denied property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedType }
     *     
     */
    public void setDenied(DeniedType value) {
        this.denied = value;
    }

    /**
     * Gets the value of the deniedNewPrescriptionToFollow property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedNewRxToFollowType }
     *     
     */
    public DeniedNewRxToFollowType getDeniedNewPrescriptionToFollow() {
        return deniedNewPrescriptionToFollow;
    }

    /**
     * Sets the value of the deniedNewPrescriptionToFollow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedNewRxToFollowType }
     *     
     */
    public void setDeniedNewPrescriptionToFollow(DeniedNewRxToFollowType value) {
        this.deniedNewPrescriptionToFollow = value;
    }

    /**
     * Gets the value of the approvedWithChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovedWithChangesType }
     *     
     */
    public ApprovedWithChangesType getApprovedWithChanges() {
        return approvedWithChanges;
    }

    /**
     * Sets the value of the approvedWithChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovedWithChangesType }
     *     
     */
    public void setApprovedWithChanges(ApprovedWithChangesType value) {
        this.approvedWithChanges = value;
    }

}
