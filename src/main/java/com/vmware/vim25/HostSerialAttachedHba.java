
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSerialAttachedHba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostSerialAttachedHba">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}HostHostBusAdapter">
 *       &lt;sequence>
 *         &lt;element name="nodeWorldWideName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSerialAttachedHba", propOrder = {
    "nodeWorldWideName"
})
public class HostSerialAttachedHba
    extends HostHostBusAdapter
{

    @XmlElement(required = true)
    protected String nodeWorldWideName;

    /**
     * Gets the value of the nodeWorldWideName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeWorldWideName() {
        return nodeWorldWideName;
    }

    /**
     * Sets the value of the nodeWorldWideName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeWorldWideName(String value) {
        this.nodeWorldWideName = value;
    }

}
