
package proxy;

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
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BankWebService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:9000/?wsdl")
public class BankWebService
    extends Service
{

    private static final URL BANKWEBSERVICE_WSDL_LOCATION;
    private static final WebServiceException BANKWEBSERVICE_EXCEPTION;
    private static final QName BANKWEBSERVICE_QNAME = new QName("http://webservice/", "BankWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWEBSERVICE_WSDL_LOCATION = url;
        BANKWEBSERVICE_EXCEPTION = e;
    }

    public BankWebService() {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME);
    }

    public BankWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME);
    }

    public BankWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort() {
        return super.getPort(new QName("http://webservice/", "BankServicePort"), BankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "BankServicePort"), BankService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWEBSERVICE_EXCEPTION!= null) {
            throw BANKWEBSERVICE_EXCEPTION;
        }
        return BANKWEBSERVICE_WSDL_LOCATION;
    }

}
