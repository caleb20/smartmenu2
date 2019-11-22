package com.smartmenu.app.smartmenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmenu.app.smartmenu.dto.PlatoDTO;
import com.smartmenu.app.smartmenu.service.PlatoService;

@RestController
@RequestMapping("menu")
@CrossOrigin(origins = "*")
public class PlatoController {

	@Autowired
	PlatoService platoService;

	@GetMapping("/lista")
	public ResponseEntity<List<PlatoDTO>> getLista() {
		List<PlatoDTO> lista = platoService.obtenerTodos();
		return new ResponseEntity<List<PlatoDTO>>(lista, HttpStatus.OK);
	}

}
