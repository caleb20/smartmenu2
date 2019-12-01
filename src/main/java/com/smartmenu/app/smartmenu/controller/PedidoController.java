package com.smartmenu.app.smartmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmenu.app.smartmenu.dto.PedidoInDTO;
import com.smartmenu.app.smartmenu.dto.PedidoOutDTO;
import com.smartmenu.app.smartmenu.service.PedidoService;

@RestController
@RequestMapping("pedido")
@CrossOrigin(origins = "*")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;

	@PostMapping("/registro")
	public ResponseEntity<PedidoOutDTO> pedido(@RequestBody PedidoInDTO pedido) {

		PedidoOutDTO pedidoDTO = pedidoService.pedido(pedido);

		return new ResponseEntity<PedidoOutDTO>(pedidoDTO, HttpStatus.OK);

	}

}
