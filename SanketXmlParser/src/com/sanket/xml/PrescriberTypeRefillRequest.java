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
 * Used in REFREQ
 * 
 * <p>Java class for PrescriberTypeRefillRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrescriberTypeRefillRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.surescripts.com/messaging}MandatoryProviderIDType"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Specialty" minOccurs="0"/>
 *         &lt;element name="ClinicName" type="{http://www.surescripts.com/messaging}an..35" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.surescripts.com/messaging}NameType"/>
 *         &lt;element name="Address" type="{http://www.surescripts.com/messaging}AddressType" minOccurs="0"/>
 *         &lt;element name="PrescriberAgent" type="{http://www.surescripts.com/messaging}NameType" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}CommunicationNumbers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriberTypeRefillRequest", propOrder = {
    "identification",
    "specialty",
    "clinicName",
    "name",
    "address",
    "prescriberAgent",
    "communicationNumbers"
})
public class PrescriberTypeRefillRequest {

    @XmlElement(name = "Identification", required = true)
    protected MandatoryProviderIDType identification;
    @XmlElement(name = "Specialty")
    protected String specialty;
    @XmlElement(name = "ClinicName")
    protected String clinicName;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "PrescriberAgent")
    protected NameType prescriberAgent;
    @XmlElement(name = "CommunicationNumbers")
    protected CommunicationNumbersType communicationNumbers;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryProviderIDType }
     *     
     */
    public MandatoryProviderIDType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryProviderIDType }
     *     
     */
    public void setIdentification(MandatoryProviderIDType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the specialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the value of the specialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialty(String value) {
        this.specialty = value;
    }

    /**
     * Gets the value of the clinicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicName() {
        return clinicName;
    }

    /**
     * Sets the value of the clinicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicName(String value) {
        this.clinicName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the prescriberAgent property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getPrescriberAgent() {
        return prescriberAgent;
    }

    /**
     * Sets the value of the prescriberAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setPrescriberAgent(NameType value) {
        this.prescriberAgent = value;
    }

    /**
     * PVD-090 or PTT-070                       Required when sending 10.6; however, receivers of 10.6 messages cannot expect this information to always be present due to translation from lower SCRIPT versions on the network
     * 
     * @return
     *     possible object is
     *     {@link CommunicationNumbersType }
     *     
     */
    public CommunicationNumbersType getCommunicationNumbers() {
        return communicationNumbers;
    }

    /**
     * Sets the value of the communicationNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationNumbersType }
     *     
     */
    public void setCommunicationNumbers(CommunicationNumbersType value) {
        this.communicationNumbers = value;
    }

}
