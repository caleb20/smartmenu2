package com.smartmenu.app.smartmenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartmenu.app.smartmenu.dto.Mensaje;
import com.smartmenu.app.smartmenu.dto.PedidoInDTO;
import com.smartmenu.app.smartmenu.service.PedidoService;

@RestController
@RequestMapping("pedido")
@CrossOrigin(origins = "*")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;

	@PostMapping("/registro")
	public List<Mensaje> login(@RequestBody PedidoInDTO pedido) {

		return pedidoService.mensajes(pedido);
	}

}
