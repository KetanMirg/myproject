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
 * Used in NEWRX,  RXCHG, CHGRES
 * 
 * <p>Java class for MandatoryPharmacyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandatoryPharmacyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.surescripts.com/messaging}MandatoryProviderIDType"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Specialty" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Pharmacist" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}StoreName"/>
 *         &lt;element name="Address" type="{http://www.surescripts.com/messaging}AddressType" minOccurs="0"/>
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
@XmlType(name = "MandatoryPharmacyType", propOrder = {
    "identification",
    "specialty",
    "pharmacist",
    "storeName",
    "address",
    "communicationNumbers"
})
public class MandatoryPharmacyType {

    @XmlElement(name = "Identification", required = true)
    protected MandatoryProviderIDType identification;
    @XmlElement(name = "Specialty")
    protected String specialty;
    @XmlElement(name = "Pharmacist")
    protected NameType pharmacist;
    @XmlElement(name = "StoreName", required = true)
    protected String storeName;
    @XmlElement(name = "Address")
    protected AddressType address;
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
     * PVD-040 Value A
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
     * Gets the value of the pharmacist property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getPharmacist() {
        return pharmacist;
    }

    /**
     * Sets the value of the pharmacist property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setPharmacist(NameType value) {
        this.pharmacist = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
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
     * PVD-090 or PTT-070
     * Required when sending 10.6; however, receivers of 10.6 messages cannot expect this information to always be present due to translation from lower SCRIPT versions on the network
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