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
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.surescripts.com/messaging}n..11M"/>
 *         &lt;element name="CodeListQualifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="38|40|87|QS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnitSourceCode" type="{http://www.surescripts.com/messaging}SourceCodeList"/>
 *         &lt;element name="PotencyUnitCode" type="{http://www.surescripts.com/messaging}an..15M"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "value",
    "codeListQualifier",
    "unitSourceCode",
    "potencyUnitCode"
})
public class QuantityType {

    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "CodeListQualifier", required = true)
    protected String codeListQualifier;
    @XmlElement(name = "UnitSourceCode", required = true)
    protected String unitSourceCode;
    @XmlElement(name = "PotencyUnitCode", required = true)
    protected String potencyUnitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListQualifier() {
        return codeListQualifier;
    }

    /**
     * Sets the value of the codeListQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListQualifier(String value) {
        this.codeListQualifier = value;
    }

    /**
     * Gets the value of the unitSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSourceCode() {
        return unitSourceCode;
    }

    /**
     * Sets the value of the unitSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSourceCode(String value) {
        this.unitSourceCode = value;
    }

    /**
     * Gets the value of the potencyUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotencyUnitCode() {
        return potencyUnitCode;
    }

    /**
     * Sets the value of the potencyUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotencyUnitCode(String value) {
        this.potencyUnitCode = value;
    }

}
