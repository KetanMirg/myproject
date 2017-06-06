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
 * <p>Java class for DrugUseEvaluationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugUseEvaluationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceReasonCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="AD|AN|AR|AT|CD|CH|CS|DA|DC|DD|DF|DI|DL|DM|DR|DS|ED|ER|EX|HD|IC|ID|LD|LK|LR|MC|MN|MS|MX|NA|NC|ND|NF|NN|NP|NR|NS|OH|PA|PC|PG|PH|PN|PP|PR|PS|RE|RF|SC|SD|SE|SF|SR|SX|TD|TN|TP|UD"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProfessionalServiceCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="00|AS|CC|DE|DP|FE|GP|MA|MB|M0|MP|MR|PA|PE|PH|PM|P0|PT|R0|RT|SC|SW|TC|TH|ZZ"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceResultCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="00|1A|1B|1C|1D|1E|1F|1G|1H|1J|1K|2A|2B|3A|3B|3C|3D|3E|3F|3G|3H|3J|3K|3M|3N|4A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CoAgent" type="{http://www.surescripts.com/messaging}CoAgentType" minOccurs="0"/>
 *         &lt;element name="ClinicalSignificanceCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="1|2|3|9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AcknowledgementReason" type="{http://www.surescripts.com/messaging}an..100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugUseEvaluationType", propOrder = {
    "serviceReasonCode",
    "professionalServiceCode",
    "serviceResultCode",
    "coAgent",
    "clinicalSignificanceCode",
    "acknowledgementReason"
})
public class DrugUseEvaluationType {

    @XmlElement(name = "ServiceReasonCode", required = true)
    protected String serviceReasonCode;
    @XmlElement(name = "ProfessionalServiceCode")
    protected String professionalServiceCode;
    @XmlElement(name = "ServiceResultCode")
    protected String serviceResultCode;
    @XmlElement(name = "CoAgent")
    protected CoAgentType coAgent;
    @XmlElement(name = "ClinicalSignificanceCode")
    protected String clinicalSignificanceCode;
    @XmlElement(name = "AcknowledgementReason")
    protected String acknowledgementReason;

    /**
     * Gets the value of the serviceReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceReasonCode() {
        return serviceReasonCode;
    }

    /**
     * Sets the value of the serviceReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceReasonCode(String value) {
        this.serviceReasonCode = value;
    }

    /**
     * Gets the value of the professionalServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalServiceCode() {
        return professionalServiceCode;
    }

    /**
     * Sets the value of the professionalServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalServiceCode(String value) {
        this.professionalServiceCode = value;
    }

    /**
     * Gets the value of the serviceResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceResultCode() {
        return serviceResultCode;
    }

    /**
     * Sets the value of the serviceResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceResultCode(String value) {
        this.serviceResultCode = value;
    }

    /**
     * Gets the value of the coAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CoAgentType }
     *     
     */
    public CoAgentType getCoAgent() {
        return coAgent;
    }

    /**
     * Sets the value of the coAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoAgentType }
     *     
     */
    public void setCoAgent(CoAgentType value) {
        this.coAgent = value;
    }

    /**
     * Gets the value of the clinicalSignificanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicalSignificanceCode() {
        return clinicalSignificanceCode;
    }

    /**
     * Sets the value of the clinicalSignificanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicalSignificanceCode(String value) {
        this.clinicalSignificanceCode = value;
    }

    /**
     * Gets the value of the acknowledgementReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledgementReason() {
        return acknowledgementReason;
    }

    /**
     * Sets the value of the acknowledgementReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledgementReason(String value) {
        this.acknowledgementReason = value;
    }

}
