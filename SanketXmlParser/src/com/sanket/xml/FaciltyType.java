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
 * Used in RxFill
 * 
 * <p>Java class for FaciltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaciltyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.surescripts.com/messaging}OptionalProviderIDType" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}FacilityName" minOccurs="0"/>
 *         &lt;element ref="{http://www.surescripts.com/messaging}Address" minOccurs="0"/>
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
@XmlType(name = "FaciltyType", propOrder = {
    "identification",
    "facilityName",
    "address",
    "communicationNumbers"
})
public class FaciltyType {

    @XmlElement(name = "Identification")
    protected OptionalProviderIDType identification;
    @XmlElement(name = "FacilityName")
    protected String facilityName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "CommunicationNumbers")
    protected CommunicationNumbersType communicationNumbers;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalProviderIDType }
     *     
     */
    public OptionalProviderIDType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalProviderIDType }
     *     
     */
    public void setIdentification(OptionalProviderIDType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
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
     * Gets the value of the communicationNumbers property.
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
