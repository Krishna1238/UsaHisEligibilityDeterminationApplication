//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.11 at 07:57:12 PM IST 
//


package com.usa.his.washingaton.inputmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.usa.his.washingaton.outputmodel.PlanInfo;


/**
 * <p>Java class for CcapPlanData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcapPlanData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kids-count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kids-age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parents-employed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="family-income" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CcapPlanData", propOrder = {
    "kidsCount",
    "kidsAge",
    "parentsEmployed",
    "familyIncome"
})
public class CcapPlanData {


	@XmlElement(name = "kids-count", required = true)
    protected String kidsCount;
    @XmlElement(name = "kids-age", required = true)
    protected String kidsAge;
    @XmlElement(name = "parents-employed", required = true)
    protected String parentsEmployed;
    @XmlElement(name = "family-income", required = true)
    protected String familyIncome;
     
     private  PlanInfo plnInfo;
    
    
    
    
    public PlanInfo getPlnInfo() {
		return plnInfo;
	}

	public void setPlnInfo(PlanInfo plnInfo) {
		this.plnInfo = plnInfo;
	}

	/**
     * Gets the value of the kidsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKidsCount() {
        return kidsCount;
    }

    /**
     * Sets the value of the kidsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKidsCount(String value) {
        this.kidsCount = value;
    }

    /**
     * Gets the value of the kidsAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKidsAge() {
        return kidsAge;
    }

    /**
     * Sets the value of the kidsAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKidsAge(String value) {
        this.kidsAge = value;
    }

    /**
     * Gets the value of the parentsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentsEmployed() {
        return parentsEmployed;
    }

    /**
     * Sets the value of the parentsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentsEmployed(String value) {
        this.parentsEmployed = value;
    }

    /**
     * Gets the value of the familyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyIncome() {
        return familyIncome;
    }

    /**
     * Sets the value of the familyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyIncome(String value) {
        this.familyIncome = value;
    }
    
    @Override
	public String toString() {
		return "CcapPlanData [kidsCount=" + kidsCount + ", kidsAge=" + kidsAge + ", parentsEmployed=" + parentsEmployed
				+ ", familyIncome=" + familyIncome + "]";
	}

}