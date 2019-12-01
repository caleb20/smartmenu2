package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;
import java.util.List;

public class PedidoInDTO implements Serializable {

	private static final long serialVersionUID = -724863918400917794L;

	private String usuario;

	private double montoTotal;

	private List<DetallePedidoInDTO> detalle;

	public List<DetallePedidoInDTO> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetallePedidoInDTO> detalle) {
		this.detalle = detalle;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
