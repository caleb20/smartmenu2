package com.smartmenu.app.smartmenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedidoEntity {

	@Id
	@Column(name = "iddetallepedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddetallepedido;

	@Column(name = "idpedido")
	private int idpedido;

	@Column(name = "codplato")
	private int codplato;

	@Column(name = "cantidadvendida")
	private int cantidadvendida;

	@Column(name = "precioxcantidad")
	private String precioxcantidad;

	public Long getIddetallepedido() {
		return iddetallepedido;
	}

	public void setIddetallepedido(Long iddetallepedido) {
		this.iddetallepedido = iddetallepedido;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getCodplato() {
		return codplato;
	}

	public void setCodplato(int codplato) {
		this.codplato = codplato;
	}

	public int getCantidadvendida() {
		return cantidadvendida;
	}

	public void setCantidadvendida(int cantidadvendida) {
		this.cantidadvendida = cantidadvendida;
	}

	public String getPrecioxcantidad() {
		return precioxcantidad;
	}

	public void setPrecioxcantidad(String precioxcantidad) {
		this.precioxcantidad = precioxcantidad;
	}

}
