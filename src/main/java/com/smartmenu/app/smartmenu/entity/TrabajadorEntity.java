package com.smartmenu.app.smartmenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajador")
public class TrabajadorEntity {

	@Id
	@Column(name = "idtrabajador")
	private Long id_trabajador;

	@Column(name = "codtienda")
	private int cod_tienda;

	@Column(name = "nomtrabajador")
	private String nom_trabajador;

	@Column(name = "sueldotrabajardor")
	private String sueldo_trabajador;

	public Long getId_trabajador() {
		return id_trabajador;
	}

	public void setId_trabajador(Long id_trabajador) {
		this.id_trabajador = id_trabajador;
	}

	public int getCod_tienda() {
		return cod_tienda;
	}

	public void setCod_tienda(int cod_tienda) {
		this.cod_tienda = cod_tienda;
	}

	public String getNom_trabajador() {
		return nom_trabajador;
	}

	public void setNom_trabajador(String nom_trabajador) {
		this.nom_trabajador = nom_trabajador;
	}

	public String getSueldo_trabajador() {
		return sueldo_trabajador;
	}

	public void setSueldo_trabajador(String sueldo_trabajador) {
		this.sueldo_trabajador = sueldo_trabajador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrabajadorEntity [id_trabajador=");
		builder.append(id_trabajador);
		builder.append(", cod_tienda=");
		builder.append(cod_tienda);
		builder.append(", nom_trabajador=");
		builder.append(nom_trabajador);
		builder.append(", sueldo_trabajador=");
		builder.append(sueldo_trabajador);
		builder.append("]");
		return builder.toString();
	}

}
