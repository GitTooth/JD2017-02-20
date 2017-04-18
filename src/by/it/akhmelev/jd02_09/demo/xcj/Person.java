//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 06:20:00 AM MSK 
//


package by.it.akhmelev.jd02_09.demo.xcj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ads" type="{http://by.it.akhmelev.jd02_09.demo}Ads"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "email",
    "password",
    "nickname",
    "ads"
})
public class Person {

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Nickname", required = true)
    protected String nickname;
    @XmlElement(name = "Ads", required = true)
    protected Ads ads;

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the nickname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the ads property.
     *
     * @return
     *     possible object is
     *     {@link Ads }
     *
     */
    public Ads getAds() {
        return ads;
    }

    /**
     * Sets the value of the ads property.
     *
     * @param value
     *     allowed object is
     *     {@link Ads }
     *
     */
    public void setAds(Ads value) {
        this.ads = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", ads=" + ads +
                '}';
    }
}