//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.11 at 07:57:12 PM IST 
//


package com.usa.his.washingaton.inputmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.usa.his.washingaton.inputmodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EligibilityDetermination_QNAME = new QName("", "eligibility-determination");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.usa.his.washingaton.inputmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EligibilityDetermination }
     * 
     */
    public EligibilityDetermination createEligibilityDetermination() {
        return new EligibilityDetermination();
    }

    /**
     * Create an instance of {@link MedicaidPlanData }
     * 
     */
    public MedicaidPlanData createMedicaidPlanData() {
        return new MedicaidPlanData();
    }

    /**
     * Create an instance of {@link CcapPlanData }
     * 
     */
    public CcapPlanData createCcapPlanData() {
        return new CcapPlanData();
    }

    /**
     * Create an instance of {@link SnapPlanData }
     * 
     */
    public SnapPlanData createSnapPlanData() {
        return new SnapPlanData();
    }

    /**
     * Create an instance of {@link PlanDetails }
     * 
     */
    public PlanDetails createPlanDetails() {
        return new PlanDetails();
    }

    /**
     * Create an instance of {@link CitigenData }
     * 
     */
    public CitigenData createCitigenData() {
        return new CitigenData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EligibilityDetermination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "eligibility-determination")
    public JAXBElement<EligibilityDetermination> createEligibilityDetermination(EligibilityDetermination value) {
        return new JAXBElement<EligibilityDetermination>(_EligibilityDetermination_QNAME, EligibilityDetermination.class, null, value);
    }

}
