
package proxy;

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
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertFromEuroToMad", targetNamespace = "http://webservice/", className = "proxy.ConvertFromEuroToMad")
    @ResponseWrapper(localName = "convertFromEuroToMadResponse", targetNamespace = "http://webservice/", className = "proxy.ConvertFromEuroToMadResponse")
    @Action(input = "http://webservice/BankService/convertFromEuroToMadRequest", output = "http://webservice/BankService/convertFromEuroToMadResponse")
    public double convertFromEuroToMad(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllAccounts", targetNamespace = "http://webservice/", className = "proxy.GetAllAccounts")
    @ResponseWrapper(localName = "getAllAccountsResponse", targetNamespace = "http://webservice/", className = "proxy.GetAllAccountsResponse")
    @Action(input = "http://webservice/BankService/getAllAccountsRequest", output = "http://webservice/BankService/getAllAccountsResponse")
    public List<Account> getAllAccounts();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountById", targetNamespace = "http://webservice/", className = "proxy.GetAccountById")
    @ResponseWrapper(localName = "getAccountByIdResponse", targetNamespace = "http://webservice/", className = "proxy.GetAccountByIdResponse")
    @Action(input = "http://webservice/BankService/getAccountByIdRequest", output = "http://webservice/BankService/getAccountByIdResponse")
    public Account getAccountById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
