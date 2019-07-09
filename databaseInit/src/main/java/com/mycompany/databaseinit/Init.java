/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.databaseinit;

import java.sql.*;

/**
 *
 * @author biar
 */
public class Init {
     /**
     * Connect to a sample database
     *
     * 
     */
    public static String url = "jdbc:sqlite:/home/biar/Desktop/DBESAME" ;
    public static void createNewDatabase() {
 
        
 
        try (Connection conn = DriverManager.getConnection(Init.url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTables() {
        // SQLite connection string
        
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS DIRECTORS (\n"
                + "	ID varchar(300) PRIMARY KEY,\n"
                + "	name varchar(300),\n"
                + "	yearOfBirth varchar(300)\n"
                + ");";
        try (Connection conn = DriverManager.getConnection(Init.url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        sql = "CREATE TABLE IF NOT EXISTS MOVIES (\n"
                + "	id varchar(300) PRIMARY KEY,\n"
                + "	title varchar(300),\n"
                + "	year varchar(300),\n"
                + "	directorID varchar(300),\n"
                + "     FOREIGN KEY(directorID) REFERENCES DIRECTORS(ID)\n"
                + ");";
         
        try (Connection conn = DriverManager.getConnection(Init.url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void initTables(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Init.url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        String sql = "INSERT INTO DIRECTORS(ID,name,yearOfBirth) VALUES(?,?,?)";
        for (int i = 0; i < 10; i++) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, "dir_id_" + i);
                pstmt.setString(2, "nome_" + i);
                pstmt.setString(3, "16-03-198" + i);
                pstmt.executeUpdate();
                System.out.print("executed insert into Directors nr. "+i+"\n");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
        sql = "INSERT INTO MOVIES(ID,title,year,directorID) VALUES(?,?,?,?)";
        for (int i = 0; i < 20; i++) {
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, "movie_id_" + i);
                pstmt.setString(2, "movie_name_" + i);
                
                if(i<10){
                   pstmt.setString(3, "16-03-200" + i);
                }else{
                   pstmt.setString(3, "16-03-20" + i); 
                }
                pstmt.setString(4, "dir_id_"+i%10); 
                
                pstmt.executeUpdate();
                System.out.print("executed insert into MOVIES nr. "+i+"\n");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewDatabase();
        createNewTables();
        initTables();
        
    }
}
