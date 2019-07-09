/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client;

/**
 *
 * @author biar
 */
public class Client {
    


    public static void main(String[] args) {
        
        java.util.List<java.lang.String> result = null;
        com.mycompany.exam.WsImplService service = null;
        com.mycompany.exam.WsInterface port = null;
        
        try { // Call Web Service Operation
            service = new com.mycompany.exam.WsImplService();
            port = service.getWsImplPort();
            // TODO process result here
            result= port.getAllMovies();
            
            
            for(int i =0; i< result.size() ; i++){
                com.mycompany.exam.Movie m = port.getMovie(result.get(i) );
                System.out.println("\n\nmovie id:\t"+m.getIdentifier()
                        +"\nmovie title:\t"+m.getTitle()
                        +"\nmovie year:\t"+m.getYear()
                        +"\nmovie direcotr:\t"+m.getDirector()
                        +"\ndirector info:\t"+port.getDirecotr(m.getDirector()) );
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
         

    }

}
