package com.smartmenu.app.smartmenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plato")
public class PlatoEntity {

	@Id
	@Column(name = "codplato")
	private Long codPlato;

	@Column(name = "nomplato")
	private String nomPlato;

	@Column(name = "tipoplato")
	private int tipoPlato;

	@Column(name = "descripcion")
	private String descripcion_plato;

	@Column(name = "precio")
	private double precio;

	@Column(name = "imagen")
	private String imagen;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getDescripcion_plato() {
		return descripcion_plato;
	}

	public void setDescripcion_plato(String descripcion_plato) {
		this.descripcion_plato = descripcion_plato;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



}
