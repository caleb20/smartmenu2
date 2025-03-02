package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class PlatoDTO implements Serializable {

	private static final long serialVersionUID = 3077261064137677306L;

	private int codTipoPlato;
	private String nombrePlato;
	private String tipoPlato;
	private String descripcionPlato;
	private int stock;
	private double precio;
	private String imagenPlato;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public int getCodTipoPlato() {
		return codTipoPlato;
	}

	public void setCodTipoPlato(int codTipoPlato) {
		this.codTipoPlato = codTipoPlato;
	}

	public String getTipoPlato() {
		return tipoPlato;
	}

	public void setTipoPlato(String tipoPlato) {
		this.tipoPlato = tipoPlato;
	}

	public String getDescripcionPlato() {
		return descripcionPlato;
	}

	public void setDescripcionPlato(String descripcionPlato) {
		this.descripcionPlato = descripcionPlato;
	}

	public String getImagenPlato() {
		return imagenPlato;
	}

	public void setImagenPlato(String imagenPlato) {
		this.imagenPlato = imagenPlato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlatoDTO [nombrePlato=");
		builder.append(nombrePlato);
		builder.append(", codTipoPlato=");
		builder.append(codTipoPlato);
		builder.append(", tipoPlato=");
		builder.append(tipoPlato);
		builder.append(", descripcionPlato=");
		builder.append(descripcionPlato);
		builder.append(", imagenPlato=");
		builder.append(imagenPlato);
		builder.append("]");
		return builder.toString();
	}

}
