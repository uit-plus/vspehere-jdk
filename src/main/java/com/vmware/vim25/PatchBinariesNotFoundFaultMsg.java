
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PatchBinariesNotFoundFault", targetNamespace = "urn:vim25")
public class PatchBinariesNotFoundFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PatchBinariesNotFound faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PatchBinariesNotFoundFaultMsg(String message, PatchBinariesNotFound faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PatchBinariesNotFoundFaultMsg(String message, PatchBinariesNotFound faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.PatchBinariesNotFound
     */
    public PatchBinariesNotFound getFaultInfo() {
        return faultInfo;
    }

}
