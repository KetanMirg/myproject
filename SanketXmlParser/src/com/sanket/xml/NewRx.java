//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 05:53:09 PM IST 
//


package com.sanket.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Request" type="{http://www.surescripts.com/messaging}NewRxRequestType" minOccurs="0"/>
 *         &lt;element name="Pharmacy" type="{http://www.surescripts.com/messaging}MandatoryPharmacyType"/>
 *         &lt;element name="Prescriber" type="{http://www.surescripts.com/messaging}MandatoryPrescriberType"/>
 *         &lt;element name="Supervisor" type="{http://www.surescripts.com/messaging}MandatorySupervisorType" minOccurs="0"/>
 *         &lt;element name="Facility" type="{http://www.surescripts.com/messaging}MandatoryFaciltyType" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://www.surescripts.com/messaging}PatientType"/>
 *         &lt;element name="MedicationPrescribed" type="{http://www.surescripts.com/messaging}NewRxPrescribedMedicationType"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Observation" minOccurs="0"/>
 *         &lt;element name="BenefitsCoordination" type="{http://www.surescripts.com/messaging}BenefitsCoordinationType" maxOccurs="3" minOccurs="0"/>
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
    "medicationPrescribed",
    "observation",
    "benefitsCoordination"
})
@XmlRootElement(name = "NewRx")
public class NewRx {

    @XmlElement(name = "Request")
    protected NewRxRequestType request;
    @XmlElement(name = "Pharmacy", required = true)
    protected MandatoryPharmacyType pharmacy;
    @XmlElement(name = "Prescriber", required = true)
    protected MandatoryPrescriberType prescriber;
    @XmlElement(name = "Supervisor")
    protected MandatorySupervisorType supervisor;
    @XmlElement(name = "Facility")
    protected MandatoryFaciltyType facility;
    @XmlElement(name = "Patient", required = true)
    protected PatientType patient;
    @XmlElement(name = "MedicationPrescribed", required = true)
    protected NewRxPrescribedMedicationType medicationPrescribed;
    @XmlElement(name = "Observation")
    protected ObservationType observation;
    @XmlElement(name = "BenefitsCoordination")
    protected List<BenefitsCoordinationType> benefitsCoordination;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link NewRxRequestType }
     *     
     */
    public NewRxRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRxRequestType }
     *     
     */
    public void setRequest(NewRxRequestType value) {
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
     *     {@link MandatoryPrescriberType }
     *     
     */
    public MandatoryPrescriberType getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryPrescriberType }
     *     
     */
    public void setPrescriber(MandatoryPrescriberType value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link MandatorySupervisorType }
     *     
     */
    public MandatorySupervisorType getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatorySupervisorType }
     *     
     */
    public void setSupervisor(MandatorySupervisorType value) {
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
     *     {@link NewRxPrescribedMedicationType }
     *     
     */
    public NewRxPrescribedMedicationType getMedicationPrescribed() {
        return medicationPrescribed;
    }

    /**
     * Sets the value of the medicationPrescribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRxPrescribedMedicationType }
     *     
     */
    public void setMedicationPrescribed(NewRxPrescribedMedicationType value) {
        this.medicationPrescribed = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType }
     *     
     */
    public ObservationType getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType }
     *     
     */
    public void setObservation(ObservationType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the benefitsCoordination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitsCoordination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitsCoordination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitsCoordinationType }
     * 
     * 
     */
    public List<BenefitsCoordinationType> getBenefitsCoordination() {
        if (benefitsCoordination == null) {
            benefitsCoordination = new ArrayList<BenefitsCoordinationType>();
        }
        return this.benefitsCoordination;
    }

}
