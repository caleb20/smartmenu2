package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;
import java.util.List;

public class HistorialDTO implements Serializable {

	private static final long serialVersionUID = 481755083002162911L;

	private List<PedidoHistorial> historial;

	public List<PedidoHistorial> getHistorial() {
		return historial;
	}

	public void setHistorial(List<PedidoHistorial> historial) {
		this.historial = historial;
	}

}
