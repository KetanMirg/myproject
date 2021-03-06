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
 *         &lt;element name="Response" type="{http://www.surescripts.com/messaging}HistoryResponseType"/>
 *         &lt;element name="Pharmacy" type="{http://www.surescripts.com/messaging}OptionalPharmacyType" minOccurs="0"/>
 *         &lt;element name="Prescriber" type="{http://www.surescripts.com/messaging}HistoryPrescriberType" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://www.surescripts.com/messaging}HistoryResponsePatientType"/>
 *         &lt;element name="BenefitsCoordination" type="{http://www.surescripts.com/messaging}BenefitsCoordinationResponseType" maxOccurs="3"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MedicationDispensed" type="{http://www.surescripts.com/messaging}HistoryDispensedMedicationType" maxOccurs="300"/>
 *           &lt;element name="MedicationPrescribed" type="{http://www.surescripts.com/messaging}HistoryPrescribedMedicationType" maxOccurs="300"/>
 *         &lt;/choice>
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
    "response",
    "pharmacy",
    "prescriber",
    "patient",
    "benefitsCoordination",
    "medicationDispensed",
    "medicationPrescribed"
})
@XmlRootElement(name = "RxHistoryResponse")
public class RxHistoryResponse {

    @XmlElement(name = "Response", required = true)
    protected HistoryResponseType response;
    @XmlElement(name = "Pharmacy")
    protected OptionalPharmacyType pharmacy;
    @XmlElement(name = "Prescriber")
    protected HistoryPrescriberType prescriber;
    @XmlElement(name = "Patient", required = true)
    protected HistoryResponsePatientType patient;
    @XmlElement(name = "BenefitsCoordination", required = true)
    protected List<BenefitsCoordinationResponseType> benefitsCoordination;
    @XmlElement(name = "MedicationDispensed")
    protected List<HistoryDispensedMedicationType> medicationDispensed;
    @XmlElement(name = "MedicationPrescribed")
    protected List<HistoryPrescribedMedicationType> medicationPrescribed;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryResponseType }
     *     
     */
    public HistoryResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryResponseType }
     *     
     */
    public void setResponse(HistoryResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the pharmacy property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalPharmacyType }
     *     
     */
    public OptionalPharmacyType getPharmacy() {
        return pharmacy;
    }

    /**
     * Sets the value of the pharmacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalPharmacyType }
     *     
     */
    public void setPharmacy(OptionalPharmacyType value) {
        this.pharmacy = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryPrescriberType }
     *     
     */
    public HistoryPrescriberType getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryPrescriberType }
     *     
     */
    public void setPrescriber(HistoryPrescriberType value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryResponsePatientType }
     *     
     */
    public HistoryResponsePatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryResponsePatientType }
     *     
     */
    public void setPatient(HistoryResponsePatientType value) {
        this.patient = value;
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
     * {@link BenefitsCoordinationResponseType }
     * 
     * 
     */
    public List<BenefitsCoordinationResponseType> getBenefitsCoordination() {
        if (benefitsCoordination == null) {
            benefitsCoordination = new ArrayList<BenefitsCoordinationResponseType>();
        }
        return this.benefitsCoordination;
    }

    /**
     * Gets the value of the medicationDispensed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationDispensed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationDispensed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryDispensedMedicationType }
     * 
     * 
     */
    public List<HistoryDispensedMedicationType> getMedicationDispensed() {
        if (medicationDispensed == null) {
            medicationDispensed = new ArrayList<HistoryDispensedMedicationType>();
        }
        return this.medicationDispensed;
    }

    /**
     * Gets the value of the medicationPrescribed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationPrescribed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationPrescribed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryPrescribedMedicationType }
     * 
     * 
     */
    public List<HistoryPrescribedMedicationType> getMedicationPrescribed() {
        if (medicationPrescribed == null) {
            medicationPrescribed = new ArrayList<HistoryPrescribedMedicationType>();
        }
        return this.medicationPrescribed;
    }

}
