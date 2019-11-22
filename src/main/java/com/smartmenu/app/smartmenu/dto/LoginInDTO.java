package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class LoginInDTO implements Serializable {

	private static final long serialVersionUID = -7640313028260996350L;

	private String usuario;
	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginInDTO [usuario=");
		builder.append(usuario);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
