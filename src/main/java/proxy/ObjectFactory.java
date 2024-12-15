
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertFromEuroToMad_QNAME = new QName("http://webservice/", "convertFromEuroToMad");
    private static final QName _ConvertFromEuroToMadResponse_QNAME = new QName("http://webservice/", "convertFromEuroToMadResponse");
    private static final QName _GetAccountById_QNAME = new QName("http://webservice/", "getAccountById");
    private static final QName _GetAccountByIdResponse_QNAME = new QName("http://webservice/", "getAccountByIdResponse");
    private static final QName _GetAllAccounts_QNAME = new QName("http://webservice/", "getAllAccounts");
    private static final QName _GetAllAccountsResponse_QNAME = new QName("http://webservice/", "getAllAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertFromEuroToMad }
     * 
     * @return
     *     the new instance of {@link ConvertFromEuroToMad }
     */
    public ConvertFromEuroToMad createConvertFromEuroToMad() {
        return new ConvertFromEuroToMad();
    }

    /**
     * Create an instance of {@link ConvertFromEuroToMadResponse }
     * 
     * @return
     *     the new instance of {@link ConvertFromEuroToMadResponse }
     */
    public ConvertFromEuroToMadResponse createConvertFromEuroToMadResponse() {
        return new ConvertFromEuroToMadResponse();
    }

    /**
     * Create an instance of {@link GetAccountById }
     * 
     * @return
     *     the new instance of {@link GetAccountById }
     */
    public GetAccountById createGetAccountById() {
        return new GetAccountById();
    }

    /**
     * Create an instance of {@link GetAccountByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountByIdResponse }
     */
    public GetAccountByIdResponse createGetAccountByIdResponse() {
        return new GetAccountByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     * @return
     *     the new instance of {@link GetAllAccounts }
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllAccountsResponse }
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertFromEuroToMad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertFromEuroToMad }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "convertFromEuroToMad")
    public JAXBElement<ConvertFromEuroToMad> createConvertFromEuroToMad(ConvertFromEuroToMad value) {
        return new JAXBElement<>(_ConvertFromEuroToMad_QNAME, ConvertFromEuroToMad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertFromEuroToMadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertFromEuroToMadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "convertFromEuroToMadResponse")
    public JAXBElement<ConvertFromEuroToMadResponse> createConvertFromEuroToMadResponse(ConvertFromEuroToMadResponse value) {
        return new JAXBElement<>(_ConvertFromEuroToMadResponse_QNAME, ConvertFromEuroToMadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountById }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAccountById")
    public JAXBElement<GetAccountById> createGetAccountById(GetAccountById value) {
        return new JAXBElement<>(_GetAccountById_QNAME, GetAccountById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAccountByIdResponse")
    public JAXBElement<GetAccountByIdResponse> createGetAccountByIdResponse(GetAccountByIdResponse value) {
        return new JAXBElement<>(_GetAccountByIdResponse_QNAME, GetAccountByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

}
