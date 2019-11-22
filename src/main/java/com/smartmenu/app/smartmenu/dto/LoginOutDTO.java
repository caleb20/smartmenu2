package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class LoginOutDTO implements Serializable {

	private static final long serialVersionUID = 6219007398603655368L;

	private String usuario;
	private int codmsj;
	private String mensaje;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getCodmsj() {
		return codmsj;
	}

	public void setCodmsj(int codmsj) {
		this.codmsj = codmsj;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginOutDTO [usuario=");
		builder.append(usuario);
		builder.append(", codmsj=");
		builder.append(codmsj);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}

}
