package com.smartmenu.app.smartmenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

	@Id
	@Column(name = "idusuario")
	private Long idUsuario;

	@Column(name = "idtrabajador")
	private int idTrabajador;

	@Column(name = "rolusuario")
	private String rolUsuario;

	@Column(name = "claveusuario")
	private String claveUsuario;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioEntity [idUsuario=");
		builder.append(idUsuario);
		builder.append(", idTrabajador=");
		builder.append(idTrabajador);
		builder.append(", rolUsuario=");
		builder.append(rolUsuario);
		builder.append(", claveUsuario=");
		builder.append(claveUsuario);
		builder.append("]");
		return builder.toString();
	}

}
