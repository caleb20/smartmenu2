package com.smartmenu.app.smartmenu.dto;

import java.io.Serializable;

public class LoginInDTO implements Serializable {

	private static final long serialVersionUID = -7640313028260996350L;

	private int idUsuario;
	private String password;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
		builder.append("LoginInDTO [idUsuario=");
		builder.append(idUsuario);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
