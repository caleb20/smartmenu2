package com.smartmenu.app.smartmenu.service;

import com.smartmenu.app.smartmenu.dto.PedidoInDTO;
import com.smartmenu.app.smartmenu.dto.PedidoOutDTO;

public interface PedidoService {
	
	PedidoOutDTO pedido(PedidoInDTO pedido);

}
