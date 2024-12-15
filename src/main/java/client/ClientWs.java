package client;

import proxy.BankService;
import proxy.BankWebService;

public class ClientWs {
    public static void main(String[] args) {
        BankService proxy = new BankWebService().getBankServicePort();
        System.out.println(proxy.convertFromEuroToMad(60));
        var account = proxy.getAccountById(3);

        System.out.println("---------------starting-------------");
        System.out.println(" " + account.getId());
        System.out.println(" " + account.getCreationDate());
        System.out.println(" " + account.getAccountBalance());
        System.out.println("------------------------------------");

       proxy.getAllAccounts().forEach(acc-> {
            System.out.println("---------------------------------");
            System.out.println(" " + acc.getId());
            System.out.println(" " + acc.getCreationDate());
            System.out.println(" " + acc.getAccountBalance());
        });
    }

}
