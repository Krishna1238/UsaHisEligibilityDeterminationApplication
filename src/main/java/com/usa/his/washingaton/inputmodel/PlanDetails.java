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


/**
 * <p>Java class for PlanDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snap-plan-data" type="{}SnapPlanData"/>
 *         &lt;element name="ccap-plan-data" type="{}CcapPlanData"/>
 *         &lt;element name="medicaid-plan-data" type="{}MedicaidPlanData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanDetails", propOrder = {
    "snapPlanData",
    "ccapPlanData",
    "medicaidPlanData"
})
public class PlanDetails {

    @XmlElement(name = "snap-plan-data", required = true)
    protected SnapPlanData snapPlanData;
    @XmlElement(name = "ccap-plan-data", required = true)
    protected CcapPlanData ccapPlanData;
    @XmlElement(name = "medicaid-plan-data", required = true)
    protected MedicaidPlanData medicaidPlanData;

    
	/**
     * Gets the value of the snapPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link SnapPlanData }
     *     
     */
    public SnapPlanData getSnapPlanData() {
        return snapPlanData;
    }

    /**
     * Sets the value of the snapPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapPlanData }
     *     
     */
    public void setSnapPlanData(SnapPlanData value) {
        this.snapPlanData = value;
    }

    /**
     * Gets the value of the ccapPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link CcapPlanData }
     *     
     */
    public CcapPlanData getCcapPlanData() {
        return ccapPlanData;
    }

    /**
     * Sets the value of the ccapPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcapPlanData }
     *     
     */
    public void setCcapPlanData(CcapPlanData value) {
        this.ccapPlanData = value;
    }

    /**
     * Gets the value of the medicaidPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link MedicaidPlanData }
     *     
     */
    public MedicaidPlanData getMedicaidPlanData() {
        return medicaidPlanData;
    }

    /**
     * Sets the value of the medicaidPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicaidPlanData }
     *     
     */
    public void setMedicaidPlanData(MedicaidPlanData value) {
        this.medicaidPlanData = value;
    }
    
    @Override
	public String toString() {
		return "PlanDetails [snapPlanData=" + snapPlanData + ", ccapPlanData=" + ccapPlanData + ", medicaidPlanData="
				+ medicaidPlanData + "]";
	}


}
