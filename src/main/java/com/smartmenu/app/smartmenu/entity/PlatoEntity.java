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
	private Long cod_plato;

	@Column(name = "nomplato")
	private String nom_plato;

	@Column(name = "tipoplato")
	private int tipo_plato;

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

	public Long getCod_plato() {
		return cod_plato;
	}

	public void setCod_plato(Long cod_plato) {
		this.cod_plato = cod_plato;
	}

	public String getNom_plato() {
		return nom_plato;
	}

	public void setNom_plato(String nom_plato) {
		this.nom_plato = nom_plato;
	}

	public int getTipo_plato() {
		return tipo_plato;
	}

	public void setTipo_plato(int tipo_plato) {
		this.tipo_plato = tipo_plato;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlatoEntity [cod_plato=");
		builder.append(cod_plato);
		builder.append(", nom_plato=");
		builder.append(nom_plato);
		builder.append(", tipo_plato=");
		builder.append(tipo_plato);
		builder.append(", descripcion_plato=");
		builder.append(descripcion_plato);
		builder.append(", imagen=");
		builder.append(imagen);
		builder.append("]");
		return builder.toString();
	}

}
