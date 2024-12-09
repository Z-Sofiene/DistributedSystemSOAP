package com.soap;

import org.soap.jaxws.BanqueService;
import org.soap.jaxws.BanqueWS;

public class ClientWS {
    public static void main(String[] args)
    {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDT
                (20.0));
    }
}