package webservice;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWebService")
public class BankService {

    @WebMethod
    public double convertFromEuroToMad(@WebParam double amount) {
        return amount * 11;
    }

    @WebMethod
    public List<Account> getAllAccounts() {
        return List.of(new Account(1, 1000 + Math.random() * 10000, new Date()),
                new Account(2, 1000 + Math.random() * 10000, new Date()),
                new Account(3, 1000 + Math.random() * 10000, new Date()),
                new Account(4, 1000 + Math.random() * 10000, new Date())
        );
    }

    @WebMethod
    public Account getAccountById(@WebParam int id) {
        return new Account(id, 1000 + Math.random() * 10000, new Date());
    }






}
