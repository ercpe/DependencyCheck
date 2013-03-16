//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.11.09 at 12:33:57 PM EST
//


package org.owasp.dependencycheck.analyzer.pom.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *         Section for management of default dependency information for use in a group of POMs.
 *
 *
 * <p>Java class for DependencyManagement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DependencyManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dependencies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependencyManagement", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class DependencyManagement {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected DependencyManagement.Dependencies dependencies;

    /**
     * Gets the value of the dependencies property.
     *
     * @return
     *     possible object is
     *     {@link DependencyManagement.Dependencies }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public DependencyManagement.Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     *
     * @param value
     *     allowed object is
     *     {@link DependencyManagement.Dependencies }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setDependencies(DependencyManagement.Dependencies value) {
        this.dependencies = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dependency"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public static class Dependencies {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
        protected List<Dependency> dependency;

        /**
         * Gets the value of the dependency property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependency property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDependency().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dependency }
         *
         *
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-11-09T12:33:57-05:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
        public List<Dependency> getDependency() {
            if (dependency == null) {
                dependency = new ArrayList<Dependency>();
            }
            return this.dependency;
        }

    }

}