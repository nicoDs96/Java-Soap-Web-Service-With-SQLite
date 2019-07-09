/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author biar
 */
@WebService
public interface WsInterface {
    
    /**
    @return a list of IDs 
    */
    public List<String> getAllMovies();
    
    /**
     * @param id get the movie id
    @return a String csv containing title,year,directorID  
    */
    public Movie getMovie(String id);
    
    /**
     * 
     * @param id id of the movie
     * @return  the movies of a director
     */
    public String getDirecotr(String id);
    
}
