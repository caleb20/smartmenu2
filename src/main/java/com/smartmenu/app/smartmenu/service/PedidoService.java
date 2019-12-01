package com.smartmenu.app.smartmenu.service;

import java.util.List;

import com.smartmenu.app.smartmenu.dto.Mensaje;
import com.smartmenu.app.smartmenu.dto.PedidoInDTO;

public interface PedidoService {
	
	List<Mensaje> mensajes(PedidoInDTO pedido);

}
