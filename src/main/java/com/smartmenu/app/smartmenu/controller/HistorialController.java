package com.smartmenu.app.smartmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmenu.app.smartmenu.dto.HistorialDTO;
import com.smartmenu.app.smartmenu.service.HistorialService;

@RestController
@RequestMapping("historial")
@CrossOrigin(origins = "*")
public class HistorialController {

	@Autowired
	HistorialService historialService;

	@GetMapping("/{usuario}")
	public ResponseEntity<HistorialDTO> getLista(@PathVariable("usuario") String usuario) {
		
		HistorialDTO historial = historialService.historial(usuario);
		
		return new ResponseEntity<HistorialDTO>(historial, HttpStatus.OK);
	}
}
