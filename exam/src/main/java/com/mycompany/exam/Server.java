/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import javax.xml.ws.Endpoint;

/**
 *
 * @author biar
 */
public class Server {
    public static void main(String args[]) throws InterruptedException{
        WsImpl ws = new WsImpl();
        String addres = "http://localhost:8080/ws";  
      
        Endpoint.publish(addres, ws);
        System.out.println("Endpoint Published...\nTry to reach the server");
       
    }
}
