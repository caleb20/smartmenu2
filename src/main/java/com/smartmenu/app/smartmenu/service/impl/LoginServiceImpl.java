package com.smartmenu.app.smartmenu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartmenu.app.smartmenu.dto.LoginInDTO;
import com.smartmenu.app.smartmenu.dto.LoginOutDTO;
import com.smartmenu.app.smartmenu.entity.UsuarioEntity;
import com.smartmenu.app.smartmenu.repository.UsuarioRepository;
import com.smartmenu.app.smartmenu.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public LoginOutDTO login(LoginInDTO in) {

		LoginOutDTO loginOutDTO = new LoginOutDTO();

		UsuarioEntity usuarioEntityUsu = usuarioRepository.findByUsuario(in.getUsuario());
		if (usuarioEntityUsu == null) {
			loginOutDTO.setCodmsj(1);
			loginOutDTO.setMensaje("Usuario no existe");
			return loginOutDTO;
		}

		UsuarioEntity usuarioEntityPass = usuarioRepository.findByUsuarioAndClaveUsuario(in.getUsuario(),
				in.getPassword());
		if (usuarioEntityPass == null) {
			loginOutDTO.setCodmsj(2);
			loginOutDTO.setMensaje("Clave incorrecta");
			return loginOutDTO;
		}

		loginOutDTO.setCodmsj(0);
		loginOutDTO.setMensaje("Login correcto");

		return loginOutDTO;
	}

}
