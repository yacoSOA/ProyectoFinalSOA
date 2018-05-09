/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Conexion;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ycarmona
 */
public class Conexion {
     
    
    public static Connection conectar(){
        Connection conec = null;
        try{
            Class.forName("com.sqlserver.jdbc.Driver");
           // conec = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","r","");
            conec = DriverManager.getConnection("jdbc:sqlserver://localhost:1433//ComprasOnline","ycarmona","");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conec;
    }
}