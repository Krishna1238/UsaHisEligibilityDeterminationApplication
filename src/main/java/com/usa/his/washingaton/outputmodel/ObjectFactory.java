//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.11 at 07:58:45 PM IST 
//


package com.usa.his.washingaton.outputmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.usa.his.washingaton.outputmodel package. 
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

    private final static QName _PlanInfo_QNAME = new QName("", "plan-info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.usa.his.washingaton.outputmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanInfo }
     * 
     */
    public PlanInfo createPlanInfo() {
        return new PlanInfo();
    }

    /**
     * Create an instance of {@link PlanApproved }
     * 
     */
    public PlanApproved createPlanApproved() {
        return new PlanApproved();
    }

    /**
     * Create an instance of {@link PlanDenied }
     * 
     */
    public PlanDenied createPlanDenied() {
        return new PlanDenied();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plan-info")
    public JAXBElement<PlanInfo> createPlanInfo(PlanInfo value) {
        return new JAXBElement<PlanInfo>(_PlanInfo_QNAME, PlanInfo.class, null, value);
    }

}
