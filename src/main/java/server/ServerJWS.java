package server;

import jakarta.xml.ws.Endpoint;
import webservice.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        var url = "http://localhost:9000/";
        Endpoint.publish(url, new BankService());
        System.out.println("Server started on " + url);
    }
}
