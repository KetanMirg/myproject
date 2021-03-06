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
 *         &lt;element ref="{http://www.surescripts.com/messaging}ClinicalInformationQualifier"/>
 *         &lt;element name="Primary" type="{http://www.surescripts.com/messaging}PrimaryDiagnosisType"/>
 *         &lt;element name="Secondary" type="{http://www.surescripts.com/messaging}DiagnosisType" minOccurs="0"/>
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
    "clinicalInformationQualifier",
    "primary",
    "secondary"
})
@XmlRootElement(name = "Diagnosis")
public class Diagnosis {

    @XmlElement(name = "ClinicalInformationQualifier", required = true)
    protected String clinicalInformationQualifier;
    @XmlElement(name = "Primary", required = true)
    protected PrimaryDiagnosisType primary;
    @XmlElement(name = "Secondary")
    protected DiagnosisType secondary;

    /**
     * Gets the value of the clinicalInformationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalInformationQualifier() {
        return clinicalInformationQualifier;
    }

    /**
     * Sets the value of the clinicalInformationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalInformationQualifier(String value) {
        this.clinicalInformationQualifier = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryDiagnosisType }
     *     
     */
    public PrimaryDiagnosisType getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryDiagnosisType }
     *     
     */
    public void setPrimary(PrimaryDiagnosisType value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisType }
     *     
     */
    public DiagnosisType getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisType }
     *     
     */
    public void setSecondary(DiagnosisType value) {
        this.secondary = value;
    }

}
