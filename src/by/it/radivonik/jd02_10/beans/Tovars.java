package by.it.radivonik.jd02_10.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tovars complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tovars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tovar" type="{http://generate.beans.jd02_09.radivonik.it.by}Tovar" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tovars", propOrder = {
        "tovar"
})
public class Tovars {

    @XmlElement(name = "Tovar", required = true)
    protected List<Tovar> tovar;

    /**
     * Gets the value of the tovar property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tovar property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTovar().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tovar }
     *
     *
     */
    public List<Tovar> getTovar() {
        if (tovar == null) {
            tovar = new ArrayList<Tovar>();
        }
        return this.tovar;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Tovars{");
        String delim = "";
        for (Tovar tovar:  getTovar()) {
            res.append(delim).append("\n").append(tovar);
            delim = ",";
        }
        res.append("}");
        return res.toString();
    }
}
