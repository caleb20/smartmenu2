package com.smartmenu.app.smartmenu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class PedidoIdentity {

	@Id
	@Column(name = "idpedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpedido;

	@Column(name = "idusuario")
	private int idusuario;

	@Column(name = "fechapedido")
	private Date fechapedido;

	@Column(name = "mesaasiganda")
	private int mesaasiganda;

	@Column(name = "montototalpedido")
	private double montototalpedido;

	public Long getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public Date getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}

	public int getMesaasiganda() {
		return mesaasiganda;
	}

	public void setMesaasiganda(int mesaasiganda) {
		this.mesaasiganda = mesaasiganda;
	}

	public double getMontototalpedido() {
		return montototalpedido;
	}

	public void setMontototalpedido(double montototalpedido) {
		this.montototalpedido = montototalpedido;
	}

}
