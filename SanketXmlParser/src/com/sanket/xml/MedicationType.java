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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DrugDescription"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DrugCoded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.surescripts.com/messaging}QuantityType" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DaysSupply" minOccurs="0"/>
 *         &lt;element name="Directions" type="{http://www.surescripts.com/messaging}an..140" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Note" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Refills" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Substitutions" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}WrittenDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}LastFillDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}ExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}EffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}PeriodEnd" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DeliveredOnDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DateValidated" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Diagnosis" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="PriorAuthorization" type="{http://www.surescripts.com/messaging}PriorAuthorizationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DrugUseEvaluation" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}DrugCoverageStatusCode" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}PriorAuthorizationStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}StructuredSIG" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationType", propOrder = {
    "drugDescription",
    "drugCoded",
    "quantity",
    "daysSupply",
    "directions",
    "note",
    "refills",
    "substitutions",
    "writtenDate",
    "lastFillDate",
    "expirationDate",
    "effectiveDate",
    "periodEnd",
    "deliveredOnDate",
    "dateValidated",
    "diagnosis",
    "priorAuthorization",
    "drugUseEvaluation",
    "drugCoverageStatusCode",
    "priorAuthorizationStatus",
    "structuredSIG"
})
public class MedicationType {

    @XmlElement(name = "DrugDescription", required = true)
    protected String drugDescription;
    @XmlElement(name = "DrugCoded")
    protected DrugCodedType drugCoded;
    @XmlElement(name = "Quantity")
    protected QuantityType quantity;
    @XmlElement(name = "DaysSupply")
    protected String daysSupply;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Refills")
    protected RefillsType refills;
    @XmlElement(name = "Substitutions")
    protected String substitutions;
    @XmlElement(name = "WrittenDate")
    protected DateType writtenDate;
    @XmlElement(name = "LastFillDate")
    protected DateType lastFillDate;
    @XmlElement(name = "ExpirationDate")
    protected DateType expirationDate;
    @XmlElement(name = "EffectiveDate")
    protected DateType effectiveDate;
    @XmlElement(name = "PeriodEnd")
    protected DateType periodEnd;
    @XmlElement(name = "DeliveredOnDate")
    protected DateType deliveredOnDate;
    @XmlElement(name = "DateValidated")
    protected DateType dateValidated;
    @XmlElement(name = "Diagnosis")
    protected List<Diagnosis> diagnosis;
    @XmlElement(name = "PriorAuthorization")
    protected PriorAuthorizationType priorAuthorization;
    @XmlElement(name = "DrugUseEvaluation")
    protected List<DrugUseEvaluationType> drugUseEvaluation;
    @XmlElement(name = "DrugCoverageStatusCode")
    protected List<String> drugCoverageStatusCode;
    @XmlElement(name = "PriorAuthorizationStatus")
    protected String priorAuthorizationStatus;
    @XmlElement(name = "StructuredSIG")
    protected List<SIGType> structuredSIG;

    /**
     * Gets the value of the drugDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugDescription() {
        return drugDescription;
    }

    /**
     * Sets the value of the drugDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugDescription(String value) {
        this.drugDescription = value;
    }

    /**
     * Gets the value of the drugCoded property.
     * 
     * @return
     *     possible object is
     *     {@link DrugCodedType }
     *     
     */
    public DrugCodedType getDrugCoded() {
        return drugCoded;
    }

    /**
     * Sets the value of the drugCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugCodedType }
     *     
     */
    public void setDrugCoded(DrugCodedType value) {
        this.drugCoded = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the daysSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysSupply() {
        return daysSupply;
    }

    /**
     * Sets the value of the daysSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysSupply(String value) {
        this.daysSupply = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the refills property.
     * 
     * @return
     *     possible object is
     *     {@link RefillsType }
     *     
     */
    public RefillsType getRefills() {
        return refills;
    }

    /**
     * Sets the value of the refills property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefillsType }
     *     
     */
    public void setRefills(RefillsType value) {
        this.refills = value;
    }

    /**
     * Gets the value of the substitutions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutions() {
        return substitutions;
    }

    /**
     * Sets the value of the substitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutions(String value) {
        this.substitutions = value;
    }

    /**
     * Gets the value of the writtenDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getWrittenDate() {
        return writtenDate;
    }

    /**
     * Sets the value of the writtenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setWrittenDate(DateType value) {
        this.writtenDate = value;
    }

    /**
     * Gets the value of the lastFillDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastFillDate() {
        return lastFillDate;
    }

    /**
     * Sets the value of the lastFillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastFillDate(DateType value) {
        this.lastFillDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpirationDate(DateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEffectiveDate(DateType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPeriodEnd(DateType value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the deliveredOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDeliveredOnDate() {
        return deliveredOnDate;
    }

    /**
     * Sets the value of the deliveredOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDeliveredOnDate(DateType value) {
        this.deliveredOnDate = value;
    }

    /**
     * Gets the value of the dateValidated property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDateValidated() {
        return dateValidated;
    }

    /**
     * Sets the value of the dateValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDateValidated(DateType value) {
        this.dateValidated = value;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diagnosis }
     * 
     * 
     */
    public List<Diagnosis> getDiagnosis() {
        if (diagnosis == null) {
            diagnosis = new ArrayList<Diagnosis>();
        }
        return this.diagnosis;
    }

    /**
     * Gets the value of the priorAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PriorAuthorizationType }
     *     
     */
    public PriorAuthorizationType getPriorAuthorization() {
        return priorAuthorization;
    }

    /**
     * Sets the value of the priorAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorAuthorizationType }
     *     
     */
    public void setPriorAuthorization(PriorAuthorizationType value) {
        this.priorAuthorization = value;
    }

    /**
     * Gets the value of the drugUseEvaluation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugUseEvaluation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugUseEvaluation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugUseEvaluationType }
     * 
     * 
     */
    public List<DrugUseEvaluationType> getDrugUseEvaluation() {
        if (drugUseEvaluation == null) {
            drugUseEvaluation = new ArrayList<DrugUseEvaluationType>();
        }
        return this.drugUseEvaluation;
    }

    /**
     * Gets the value of the drugCoverageStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugCoverageStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugCoverageStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDrugCoverageStatusCode() {
        if (drugCoverageStatusCode == null) {
            drugCoverageStatusCode = new ArrayList<String>();
        }
        return this.drugCoverageStatusCode;
    }

    /**
     * Gets the value of the priorAuthorizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorAuthorizationStatus() {
        return priorAuthorizationStatus;
    }

    /**
     * Sets the value of the priorAuthorizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorAuthorizationStatus(String value) {
        this.priorAuthorizationStatus = value;
    }

    /**
     * Gets the value of the structuredSIG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredSIG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuredSIG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SIGType }
     * 
     * 
     */
    public List<SIGType> getStructuredSIG() {
        if (structuredSIG == null) {
            structuredSIG = new ArrayList<SIGType>();
        }
        return this.structuredSIG;
    }

}
