package com.smartmenu.app.smartmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmenu.app.smartmenu.dto.LoginInDTO;
import com.smartmenu.app.smartmenu.dto.LoginOutDTO;
import com.smartmenu.app.smartmenu.service.LoginService;

@RestController
@RequestMapping("menu")
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<LoginOutDTO> login(@RequestBody LoginInDTO loginUsuario) {

		LoginOutDTO loginOut = loginService.login(loginUsuario);

		return new ResponseEntity<LoginOutDTO>(loginOut, HttpStatus.OK);
	}
}
