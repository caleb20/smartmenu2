package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;
import java.util.List;

public class PedidoInDTO implements Serializable {

	private static final long serialVersionUID = -724863918400917794L;

	private String idUsuario;

	private double montoTotal;

	private List<DetallePedidoDTO> detalle;

	public List<DetallePedidoDTO> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetallePedidoDTO> detalle) {
		this.detalle = detalle;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
