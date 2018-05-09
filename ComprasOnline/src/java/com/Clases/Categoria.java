/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clases;

/**
 *
 * @author ycarmona
 */
public class Categoria {
    private int id_categoria;
    private String nombre;
    private String estado;
    
    public Categoria() {
	}
	
	public Categoria(int id_categoria,String nombre, String estado) {
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.estado = estado;
        }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
	public String toString() {
		return this.id_categoria+", "+this.nombre+", "+this.estado;
	}
} 