
package org.soap.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ProduitSWSoap", targetNamespace = "http://services/", wsdlLocation = "http://192.168.31.213:18585/GP/ProduitSWSoap/?wsdl")
public class ProduitSWSoap_Service
    extends Service
{

    private static final URL PRODUITSWSOAP_WSDL_LOCATION;
    private static final WebServiceException PRODUITSWSOAP_EXCEPTION;
    private static final QName PRODUITSWSOAP_QNAME = new QName("http://services/", "ProduitSWSoap");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.31.213:18585/GP/ProduitSWSoap/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUITSWSOAP_WSDL_LOCATION = url;
        PRODUITSWSOAP_EXCEPTION = e;
    }

    public ProduitSWSoap_Service() {
        super(__getWsdlLocation(), PRODUITSWSOAP_QNAME);
    }

    public ProduitSWSoap_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUITSWSOAP_QNAME, features);
    }

    public ProduitSWSoap_Service(URL wsdlLocation) {
        super(wsdlLocation, PRODUITSWSOAP_QNAME);
    }

    public ProduitSWSoap_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUITSWSOAP_QNAME, features);
    }

    public ProduitSWSoap_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProduitSWSoap_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProduitSWSoap
     */
    @WebEndpoint(name = "ProduitSWSoapPort")
    public ProduitSWSoap getProduitSWSoapPort() {
        return super.getPort(new QName("http://services/", "ProduitSWSoapPort"), ProduitSWSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProduitSWSoap
     */
    @WebEndpoint(name = "ProduitSWSoapPort")
    public ProduitSWSoap getProduitSWSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "ProduitSWSoapPort"), ProduitSWSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUITSWSOAP_EXCEPTION!= null) {
            throw PRODUITSWSOAP_EXCEPTION;
        }
        return PRODUITSWSOAP_WSDL_LOCATION;
    }

}
