package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class PedidoHistorial implements Serializable {

	private static final long serialVersionUID = 5541714171022755511L;

	private int numPedido;

	private String monto;

	private String fecha;

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
