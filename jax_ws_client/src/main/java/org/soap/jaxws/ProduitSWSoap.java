
package org.soap.jaxws;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ProduitSWSoap", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProduitSWSoap {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.soap.jaxws.Produit
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduit", targetNamespace = "http://services/", className = "org.soap.jaxws.AddProduit")
    @ResponseWrapper(localName = "addProduitResponse", targetNamespace = "http://services/", className = "org.soap.jaxws.AddProduitResponse")
    @Action(input = "http://services/ProduitSWSoap/addProduitRequest", output = "http://services/ProduitSWSoap/addProduitResponse")
    public Produit addProduit(
        @WebParam(name = "arg0", targetNamespace = "")
        Produit arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.soap.jaxws.Produit
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateProduit", targetNamespace = "http://services/", className = "org.soap.jaxws.UpdateProduit")
    @ResponseWrapper(localName = "updateProduitResponse", targetNamespace = "http://services/", className = "org.soap.jaxws.UpdateProduitResponse")
    @Action(input = "http://services/ProduitSWSoap/updateProduitRequest", output = "http://services/ProduitSWSoap/updateProduitResponse")
    public Produit updateProduit(
        @WebParam(name = "arg0", targetNamespace = "")
        Produit arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteProduit", targetNamespace = "http://services/", className = "org.soap.jaxws.DeleteProduit")
    @ResponseWrapper(localName = "deleteProduitResponse", targetNamespace = "http://services/", className = "org.soap.jaxws.DeleteProduitResponse")
    @Action(input = "http://services/ProduitSWSoap/deleteProduitRequest", output = "http://services/ProduitSWSoap/deleteProduitResponse")
    public void deleteProduit(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.soap.jaxws.Produit
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduit", targetNamespace = "http://services/", className = "org.soap.jaxws.GetProduit")
    @ResponseWrapper(localName = "getProduitResponse", targetNamespace = "http://services/", className = "org.soap.jaxws.GetProduitResponse")
    @Action(input = "http://services/ProduitSWSoap/getProduitRequest", output = "http://services/ProduitSWSoap/getProduitResponse")
    public Produit getProduit(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.soap.jaxws.Produit>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllProduits", targetNamespace = "http://services/", className = "org.soap.jaxws.GetAllProduits")
    @ResponseWrapper(localName = "getAllProduitsResponse", targetNamespace = "http://services/", className = "org.soap.jaxws.GetAllProduitsResponse")
    @Action(input = "http://services/ProduitSWSoap/getAllProduitsRequest", output = "http://services/ProduitSWSoap/getAllProduitsResponse")
    public List<Produit> getAllProduits();

}