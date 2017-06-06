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
 *         &lt;element name="Pharmacy" type="{http://www.surescripts.com/messaging}OptionalPharmacyType" minOccurs="0"/>
 *         &lt;element name="Prescriber" type="{http://www.surescripts.com/messaging}OptionalPrescriberType" minOccurs="0"/>
 *         &lt;element name="Patient" type="{http://www.surescripts.com/messaging}HistoryRequestPatientType"/>
 *         &lt;element name="BenefitsCoordination" type="{http://www.surescripts.com/messaging}BenefitsCoordinationRequestType" maxOccurs="3"/>
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
    "pharmacy",
    "prescriber",
    "patient",
    "benefitsCoordination"
})
@XmlRootElement(name = "RxHistoryRequest")
public class RxHistoryRequest {

    @XmlElement(name = "Pharmacy")
    protected OptionalPharmacyType pharmacy;
    @XmlElement(name = "Prescriber")
    protected OptionalPrescriberType prescriber;
    @XmlElement(name = "Patient", required = true)
    protected HistoryRequestPatientType patient;
    @XmlElement(name = "BenefitsCoordination", required = true)
    protected List<BenefitsCoordinationRequestType> benefitsCoordination;

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
     *     {@link OptionalPrescriberType }
     *     
     */
    public OptionalPrescriberType getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalPrescriberType }
     *     
     */
    public void setPrescriber(OptionalPrescriberType value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryRequestPatientType }
     *     
     */
    public HistoryRequestPatientType getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryRequestPatientType }
     *     
     */
    public void setPatient(HistoryRequestPatientType value) {
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
     * {@link BenefitsCoordinationRequestType }
     * 
     * 
     */
    public List<BenefitsCoordinationRequestType> getBenefitsCoordination() {
        if (benefitsCoordination == null) {
            benefitsCoordination = new ArrayList<BenefitsCoordinationRequestType>();
        }
        return this.benefitsCoordination;
    }

}
