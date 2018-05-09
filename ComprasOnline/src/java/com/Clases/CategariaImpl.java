/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import com.Conexion.Conexion;
/**
 *
 * @author ESTUDIANTE
 */
public class CategariaImpl extends CategoriaDAO{
    
    @Override
	public boolean registrar(Categoria categoria) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection conec=null;
		
		String sql="INSERT INTO categoria values (NULL,'"+categoria.getId_categoria()+"','"+categoria.getNombre()+"','"+categoria.getEstado()+"')";
		
		try {			
			conec=Conexion.conectar();
			stm= conec.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			conec.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CategoriaDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	@Override
	public List<Categoria> obtener() {
		Connection conec =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM CATEGORIA ORDER BY ID";
		
		List<Categoria> listaCategoria= new ArrayList<Categoria>();
		
		try {			
			conec= Conexion.conectar();
			stm=conec.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Categoria c=new Categoria();
				c.setId_categoria(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setEstado(rs.getString(3));
				listaCategoria.add(c);
			}
			stm.close();
			rs.close();
			conec.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CategoriaDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaCategoria;
	}
    
}


