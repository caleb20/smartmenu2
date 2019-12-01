package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;
import java.util.List;

public class PedidoOutDTO implements Serializable {

	private static final long serialVersionUID = 1590942304971268678L;

	private double montoTotal;

	private List<DetallePedidoOutDTO> detalle;

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<DetallePedidoOutDTO> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetallePedidoOutDTO> detalle) {
		this.detalle = detalle;
	}

}
