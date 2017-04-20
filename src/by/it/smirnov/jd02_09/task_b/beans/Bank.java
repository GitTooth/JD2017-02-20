//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.19 at 08:45:19 PM MSK 
//


package by.it.smirnov.jd02_09.task_b.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Bank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MFO" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FullMFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://task_b.jd02_09.smirnov.it.by/}Address"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bank", propOrder = {
    "name",
    "mfo",
    "fullMFO",
    "address",
    "group"
})
public class Bank {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "MFO", required = true)
    protected BigInteger mfo;
    @XmlElement(name = "FullMFO", required = true)
    protected String fullMFO;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "Group")
    protected List<String> group;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mfo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMFO() {
        return mfo;
    }

    /**
     * Sets the value of the mfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMFO(BigInteger value) {
        this.mfo = value;
    }

    /**
     * Gets the value of the fullMFO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullMFO() {
        return fullMFO;
    }

    /**
     * Sets the value of the fullMFO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullMFO(String value) {
        this.fullMFO = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroup() {
        if (group == null) {
            group = new ArrayList<String>();
        }
        return this.group;
    }

    public Bank() {}

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", mfo=" + mfo +
                ", fullMFO='" + fullMFO + '\'' +
                ", address=" + address +
                ", group=" + group +
                '}';
    }
}
