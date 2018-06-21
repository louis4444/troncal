package com.proyecto.jpa.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * The persistent class for the administradores database table.
 * 
 */
@Entity
public class Administradores {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "contraseña")
	private String contraseña;
	@Column(name = "nombre")
	private String nombre;

	public Administradores() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}