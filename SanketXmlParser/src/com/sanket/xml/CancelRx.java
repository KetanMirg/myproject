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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request" type="{http://www.surescripts.com/messaging}CancelRequestType" minOccurs="0"/>
 *         &lt;element name="Pharmacy" type="{http://www.surescripts.com/messaging}MandatoryPharmacyType"/>
 *         &lt;element name="Prescriber" type="{http://www.surescripts.com/messaging}CancelPrescriberType"/>
 *         &lt;element name="Supervisor" type="{http://www.surescripts.com/messaging}CancelSupervisorType" minOccurs="0"/>
 *         &lt;element name="Facility" type="{http://www.surescripts.com/messaging}MandatoryFaciltyType" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://www.surescripts.com/messaging}PatientType"/>
 *         &lt;element name="MedicationPrescribed" type="{http://www.surescripts.com/messaging}PrescribedMedicationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "pharmacy",
    "prescriber",
    "supervisor",
    "facility",
    "patient",
    "medicationPrescribed"
})
@XmlRootElement(name = "CancelRx")
public class CancelRx {

    @XmlElement(name = "Request")
    protected CancelRequestType request;
    @XmlElement(name = "Pharmacy", required = true)
    protected MandatoryPharmacyType pharmacy;
    @XmlElement(name = "Prescriber", required = true)
    protected CancelPrescriberType prescriber;
    @XmlElement(name = "Supervisor")
    protected CancelSupervisorType supervisor;
    @XmlElement(name = "Facility")
    protected MandatoryFaciltyType facility;
    @XmlElement(name = "Patient", required = true)
    protected PatientType patient;
    @XmlElement(name = "MedicationPrescribed", required = true)
    protected PrescribedMedicationType medicationPrescribed;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRequestType }
     *     
     */
    public CancelRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRequestType }
     *     
     */
    public void setRequest(CancelRequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryPharmacyType }
     *     
     */
    public MandatoryPharmacyType getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryPharmacyType }
     *     
     */
    public void setPharmacy(MandatoryPharmacyType value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPrescriberType }
     *     
     */
    public CancelPrescriberType getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPrescriberType }
     *     
     */
    public void setPrescriber(CancelPrescriberType value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link CancelSupervisorType }
     *     
     */
    public CancelSupervisorType getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelSupervisorType }
     *     
     */
    public void setSupervisor(CancelSupervisorType value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryFaciltyType }
     *     
     */
    public MandatoryFaciltyType getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryFaciltyType }
     *     
     */
    public void setFacility(MandatoryFaciltyType value) {
        this.facility = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link PatientType }
     *     
     */
    public PatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientType }
     *     
     */
    public void setPatient(PatientType value) {
        this.patient = value;
    }

    /**
     * Gets the value of the medicationPrescribed property.
     * 
     * @return
     *     possible object is
     *     {@link PrescribedMedicationType }
     *     
     */
    public PrescribedMedicationType getMedicationPrescribed() {
        return medicationPrescribed;
    }

    /**
     * Sets the value of the medicationPrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescribedMedicationType }
     *     
     */
    public void setMedicationPrescribed(PrescribedMedicationType value) {
        this.medicationPrescribed = value;
    }

}
