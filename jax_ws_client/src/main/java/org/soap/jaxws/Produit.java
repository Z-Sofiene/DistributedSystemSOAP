
package org.soap.jaxws;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for produit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="produit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateAchat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produit", propOrder = {
    "dateAchat",
    "designation",
    "id",
    "prix",
    "quantite"
})
public class Produit {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAchat;
    protected String designation;
    protected Long id;
    protected double prix;
    protected int quantite;

    /**
     * Gets the value of the dateAchat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAchat() {
        return dateAchat;
    }

    /**
     * Sets the value of the dateAchat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAchat(XMLGregorianCalendar value) {
        this.dateAchat = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Gets the value of the quantite property.
     * 
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     */
    public void setQuantite(int value) {
        this.quantite = value;
    }

}
