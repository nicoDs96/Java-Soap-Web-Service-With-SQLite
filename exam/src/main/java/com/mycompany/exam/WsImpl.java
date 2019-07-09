/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author biar
 */
@WebService(endpointInterface="com.mycompany.exam.WsInterface")
public class WsImpl implements WsInterface{
    
    public static String url = "jdbc:sqlite:/home/biar/Desktop/DBESAME" ;

    @Override
    public List<String> getAllMovies() {
        
        List<String> ids = new ArrayList<>();
        
        String sql = "SELECT ID FROM MOVIES";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql) ){
            
            // loop through the result set
            while (rs.next()) {
                ids.add(rs.getString("ID"));
            }
            return ids;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Movie getMovie(String id) {
        
        Movie m = new Movie();
        
        String sql = "SELECT ID, title, year, directorId "
                          + "FROM MOVIES WHERE id = ?";
        
        try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1,id);
            //
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
                
                if(rs.getString("id").equals(0) ){
                    System.out.println("Id "+id+" is not valid.\n");
                    return null;
                }
                m.setId(id);
                m.setTitle(rs.getString("title") );
                m.setYear(rs.getString("year") );
                m.setDirector(rs.getString("directorId") );
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }

    @Override
    public String getDirecotr(String id) {
        String dir = "";
        
        String sql = "SELECT ID, name, yearOfBirth "
                          + "FROM DIRECTORS WHERE id = ?";
        
        try (Connection conn = this.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1,id);
            //
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
                
                if(rs.getString("id").equals(0) ){
                    System.out.println("Id "+id+" is not valid.\n");
                    return null;
                }
                dir = "id:"+id+",name:"+rs.getString("name")+",dob:"+rs.getString("yearOfBirth");
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dir;
    }
    
    
    private Connection connect() {
        // SQLite connection string    
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(WsImpl.url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
