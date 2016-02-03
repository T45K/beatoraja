//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 11:34:54 AM JST 
//


package bms.player.lunaticrave2.config;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}optimumlevel_7"/>
 *         &lt;element ref="{}optimumlevel_5"/>
 *         &lt;element ref="{}optimumlevel_10"/>
 *         &lt;element ref="{}optimumlevel_14"/>
 *         &lt;element ref="{}optimumlevel_9"/>
 *         &lt;element ref="{}defaultconnection"/>
 *         &lt;element ref="{}defaultgauge"/>
 *         &lt;element ref="{}maxbpm"/>
 *         &lt;element ref="{}minbpm"/>
 *         &lt;element ref="{}bpmrange"/>
 *         &lt;element ref="{}maxlevel"/>
 *         &lt;element ref="{}minlevel"/>
 *         &lt;element ref="{}stage"/>
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
    "optimumlevel7",
    "optimumlevel5",
    "optimumlevel10",
    "optimumlevel14",
    "optimumlevel9",
    "defaultconnection",
    "defaultgauge",
    "maxbpm",
    "minbpm",
    "bpmrange",
    "maxlevel",
    "minlevel",
    "stage"
})
@XmlRootElement(name = "course")
public class Course {

    @XmlElement(name = "optimumlevel_7", required = true)
    protected BigInteger optimumlevel7;
    @XmlElement(name = "optimumlevel_5", required = true)
    protected BigInteger optimumlevel5;
    @XmlElement(name = "optimumlevel_10", required = true)
    protected BigInteger optimumlevel10;
    @XmlElement(name = "optimumlevel_14", required = true)
    protected BigInteger optimumlevel14;
    @XmlElement(name = "optimumlevel_9", required = true)
    protected BigInteger optimumlevel9;
    @XmlElement(required = true)
    protected BigInteger defaultconnection;
    @XmlElement(required = true)
    protected BigInteger defaultgauge;
    @XmlElement(required = true)
    protected BigInteger maxbpm;
    @XmlElement(required = true)
    protected BigInteger minbpm;
    @XmlElement(required = true)
    protected BigInteger bpmrange;
    @XmlElement(required = true)
    protected BigInteger maxlevel;
    @XmlElement(required = true)
    protected BigInteger minlevel;
    @XmlElement(required = true)
    protected BigInteger stage;

    /**
     * Gets the value of the optimumlevel7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimumlevel7() {
        return optimumlevel7;
    }

    /**
     * Sets the value of the optimumlevel7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimumlevel7(BigInteger value) {
        this.optimumlevel7 = value;
    }

    /**
     * Gets the value of the optimumlevel5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimumlevel5() {
        return optimumlevel5;
    }

    /**
     * Sets the value of the optimumlevel5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimumlevel5(BigInteger value) {
        this.optimumlevel5 = value;
    }

    /**
     * Gets the value of the optimumlevel10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimumlevel10() {
        return optimumlevel10;
    }

    /**
     * Sets the value of the optimumlevel10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimumlevel10(BigInteger value) {
        this.optimumlevel10 = value;
    }

    /**
     * Gets the value of the optimumlevel14 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimumlevel14() {
        return optimumlevel14;
    }

    /**
     * Sets the value of the optimumlevel14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimumlevel14(BigInteger value) {
        this.optimumlevel14 = value;
    }

    /**
     * Gets the value of the optimumlevel9 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOptimumlevel9() {
        return optimumlevel9;
    }

    /**
     * Sets the value of the optimumlevel9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOptimumlevel9(BigInteger value) {
        this.optimumlevel9 = value;
    }

    /**
     * Gets the value of the defaultconnection property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefaultconnection() {
        return defaultconnection;
    }

    /**
     * Sets the value of the defaultconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefaultconnection(BigInteger value) {
        this.defaultconnection = value;
    }

    /**
     * Gets the value of the defaultgauge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefaultgauge() {
        return defaultgauge;
    }

    /**
     * Sets the value of the defaultgauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefaultgauge(BigInteger value) {
        this.defaultgauge = value;
    }

    /**
     * Gets the value of the maxbpm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxbpm() {
        return maxbpm;
    }

    /**
     * Sets the value of the maxbpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxbpm(BigInteger value) {
        this.maxbpm = value;
    }

    /**
     * Gets the value of the minbpm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinbpm() {
        return minbpm;
    }

    /**
     * Sets the value of the minbpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinbpm(BigInteger value) {
        this.minbpm = value;
    }

    /**
     * Gets the value of the bpmrange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBpmrange() {
        return bpmrange;
    }

    /**
     * Sets the value of the bpmrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBpmrange(BigInteger value) {
        this.bpmrange = value;
    }

    /**
     * Gets the value of the maxlevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxlevel() {
        return maxlevel;
    }

    /**
     * Sets the value of the maxlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxlevel(BigInteger value) {
        this.maxlevel = value;
    }

    /**
     * Gets the value of the minlevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinlevel() {
        return minlevel;
    }

    /**
     * Sets the value of the minlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinlevel(BigInteger value) {
        this.minlevel = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStage(BigInteger value) {
        this.stage = value;
    }

}
