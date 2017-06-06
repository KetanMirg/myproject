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
 * Used in CANRX CANRES
 * 
 * <p>Java class for CancelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeRequestType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="C1|C2|C3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReturnReceipt" type="{http://www.surescripts.com/messaging}an..3" minOccurs="0"/>
 *         &lt;element name="RequestReferenceNumber" type="{http://www.surescripts.com/messaging}an..35" minOccurs="0"/>
 *         &lt;element name="ChangeofPrescriptionStatusFlag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="D|C"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRequestType", propOrder = {
    "changeRequestType",
    "returnReceipt",
    "requestReferenceNumber",
    "changeofPrescriptionStatusFlag"
})
public class CancelRequestType {

    @XmlElement(name = "ChangeRequestType")
    protected String changeRequestType;
    @XmlElement(name = "ReturnReceipt")
    protected String returnReceipt;
    @XmlElement(name = "RequestReferenceNumber")
    protected String requestReferenceNumber;
    @XmlElement(name = "ChangeofPrescriptionStatusFlag")
    protected String changeofPrescriptionStatusFlag;

    /**
     * Gets the value of the changeRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeRequestType() {
        return changeRequestType;
    }

    /**
     * Sets the value of the changeRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeRequestType(String value) {
        this.changeRequestType = value;
    }

    /**
     * Gets the value of the returnReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReceipt() {
        return returnReceipt;
    }

    /**
     * Sets the value of the returnReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReceipt(String value) {
        this.returnReceipt = value;
    }

    /**
     * Gets the value of the requestReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestReferenceNumber() {
        return requestReferenceNumber;
    }

    /**
     * Sets the value of the requestReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestReferenceNumber(String value) {
        this.requestReferenceNumber = value;
    }

    /**
     * Gets the value of the changeofPrescriptionStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeofPrescriptionStatusFlag() {
        return changeofPrescriptionStatusFlag;
    }

    /**
     * Sets the value of the changeofPrescriptionStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeofPrescriptionStatusFlag(String value) {
        this.changeofPrescriptionStatusFlag = value;
    }

}
