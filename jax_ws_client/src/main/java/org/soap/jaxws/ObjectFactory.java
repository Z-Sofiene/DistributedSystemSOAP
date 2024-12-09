
package org.soap.jaxws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soap.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddProduit_QNAME = new QName("http://services/", "addProduit");
    private static final QName _AddProduitResponse_QNAME = new QName("http://services/", "addProduitResponse");
    private static final QName _DeleteProduit_QNAME = new QName("http://services/", "deleteProduit");
    private static final QName _DeleteProduitResponse_QNAME = new QName("http://services/", "deleteProduitResponse");
    private static final QName _GetAllProduits_QNAME = new QName("http://services/", "getAllProduits");
    private static final QName _GetAllProduitsResponse_QNAME = new QName("http://services/", "getAllProduitsResponse");
    private static final QName _GetProduit_QNAME = new QName("http://services/", "getProduit");
    private static final QName _GetProduitResponse_QNAME = new QName("http://services/", "getProduitResponse");
    private static final QName _UpdateProduit_QNAME = new QName("http://services/", "updateProduit");
    private static final QName _UpdateProduitResponse_QNAME = new QName("http://services/", "updateProduitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soap.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduit }
     * 
     * @return
     *     the new instance of {@link AddProduit }
     */
    public AddProduit createAddProduit() {
        return new AddProduit();
    }

    /**
     * Create an instance of {@link AddProduitResponse }
     * 
     * @return
     *     the new instance of {@link AddProduitResponse }
     */
    public AddProduitResponse createAddProduitResponse() {
        return new AddProduitResponse();
    }

    /**
     * Create an instance of {@link DeleteProduit }
     * 
     * @return
     *     the new instance of {@link DeleteProduit }
     */
    public DeleteProduit createDeleteProduit() {
        return new DeleteProduit();
    }

    /**
     * Create an instance of {@link DeleteProduitResponse }
     * 
     * @return
     *     the new instance of {@link DeleteProduitResponse }
     */
    public DeleteProduitResponse createDeleteProduitResponse() {
        return new DeleteProduitResponse();
    }

    /**
     * Create an instance of {@link GetAllProduits }
     * 
     * @return
     *     the new instance of {@link GetAllProduits }
     */
    public GetAllProduits createGetAllProduits() {
        return new GetAllProduits();
    }

    /**
     * Create an instance of {@link GetAllProduitsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllProduitsResponse }
     */
    public GetAllProduitsResponse createGetAllProduitsResponse() {
        return new GetAllProduitsResponse();
    }

    /**
     * Create an instance of {@link GetProduit }
     * 
     * @return
     *     the new instance of {@link GetProduit }
     */
    public GetProduit createGetProduit() {
        return new GetProduit();
    }

    /**
     * Create an instance of {@link GetProduitResponse }
     * 
     * @return
     *     the new instance of {@link GetProduitResponse }
     */
    public GetProduitResponse createGetProduitResponse() {
        return new GetProduitResponse();
    }

    /**
     * Create an instance of {@link UpdateProduit }
     * 
     * @return
     *     the new instance of {@link UpdateProduit }
     */
    public UpdateProduit createUpdateProduit() {
        return new UpdateProduit();
    }

    /**
     * Create an instance of {@link UpdateProduitResponse }
     * 
     * @return
     *     the new instance of {@link UpdateProduitResponse }
     */
    public UpdateProduitResponse createUpdateProduitResponse() {
        return new UpdateProduitResponse();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     * @return
     *     the new instance of {@link Produit }
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProduit }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addProduit")
    public JAXBElement<AddProduit> createAddProduit(AddProduit value) {
        return new JAXBElement<>(_AddProduit_QNAME, AddProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addProduitResponse")
    public JAXBElement<AddProduitResponse> createAddProduitResponse(AddProduitResponse value) {
        return new JAXBElement<>(_AddProduitResponse_QNAME, AddProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProduit }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteProduit")
    public JAXBElement<DeleteProduit> createDeleteProduit(DeleteProduit value) {
        return new JAXBElement<>(_DeleteProduit_QNAME, DeleteProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteProduitResponse")
    public JAXBElement<DeleteProduitResponse> createDeleteProduitResponse(DeleteProduitResponse value) {
        return new JAXBElement<>(_DeleteProduitResponse_QNAME, DeleteProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProduits }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAllProduits")
    public JAXBElement<GetAllProduits> createGetAllProduits(GetAllProduits value) {
        return new JAXBElement<>(_GetAllProduits_QNAME, GetAllProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduitsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProduitsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getAllProduitsResponse")
    public JAXBElement<GetAllProduitsResponse> createGetAllProduitsResponse(GetAllProduitsResponse value) {
        return new JAXBElement<>(_GetAllProduitsResponse_QNAME, GetAllProduitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getProduit")
    public JAXBElement<GetProduit> createGetProduit(GetProduit value) {
        return new JAXBElement<>(_GetProduit_QNAME, GetProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getProduitResponse")
    public JAXBElement<GetProduitResponse> createGetProduitResponse(GetProduitResponse value) {
        return new JAXBElement<>(_GetProduitResponse_QNAME, GetProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProduit }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateProduit")
    public JAXBElement<UpdateProduit> createUpdateProduit(UpdateProduit value) {
        return new JAXBElement<>(_UpdateProduit_QNAME, UpdateProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateProduitResponse")
    public JAXBElement<UpdateProduitResponse> createUpdateProduitResponse(UpdateProduitResponse value) {
        return new JAXBElement<>(_UpdateProduitResponse_QNAME, UpdateProduitResponse.class, null, value);
    }

}
