package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class PlatoDTO implements Serializable {

	private static final long serialVersionUID = 3077261064137677306L;

	private String nombrePlato;
	private int codTipoPlato;
	private String tipoPlato;
	private String descripcionPlato;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlatoDTO [nombrePlatp=");
		builder.append(nombrePlato);
		builder.append(", codTipoPlato=");
		builder.append(codTipoPlato);
		builder.append(", tipoPlato=");
		builder.append(tipoPlato);
		builder.append(", descripcionPlato=");
		builder.append(descripcionPlato);
		builder.append("]");
		return builder.toString();
	}

}
