package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class DetallePedidoDTO implements Serializable {

	private static final long serialVersionUID = 401850464310447431L;

	private Long idPlato;

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
