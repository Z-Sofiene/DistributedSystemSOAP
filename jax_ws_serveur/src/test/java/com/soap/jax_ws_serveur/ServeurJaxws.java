package com.soap.jax_ws_serveur;

import jakarta.xml.ws.Endpoint;
import services.ProduitSWSoap;

public class ServeurJaxws
{
    public static void main(String[] args)
    {
        String url ="http://192.168.31.213:18585/GP/ProduitSWSoap";
        Endpoint.publish(url, new ProduitSWSoap());
        System.out.println("Service Web publié à l'adresse : " + url + "?wsdl");
        String url2 ="http://192.168.31.213:18585/BanqueWS";
        Endpoint.publish(url2, new BanqueService());
        System.out.println("Service Web BANQUE publié à l'adresse : " + url2 + "?wsdl");
    }
}