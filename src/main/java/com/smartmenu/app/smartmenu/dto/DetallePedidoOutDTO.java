package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class DetallePedidoOutDTO implements Serializable {

	private static final long serialVersionUID = 401850464310447431L;

	private Long idPlato;

	private String nombrePlato;

	private double precioxPlato;
	
	private int codMensaje;

	private String mensaje;

	public int getCodMensaje() {
		return codMensaje;
	}

	public void setCodMensaje(int codMensaje) {
		this.codMensaje = codMensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public double getPrecioxPlato() {
		return precioxPlato;
	}

	public void setPrecioxPlato(double precioxPlato) {
		this.precioxPlato = precioxPlato;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	private int cantidad;

	public Long getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(Long idPlato) {
		this.idPlato = idPlato;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
