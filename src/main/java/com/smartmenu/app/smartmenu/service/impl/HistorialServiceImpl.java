package com.smartmenu.app.smartmenu.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartmenu.app.smartmenu.dto.HistorialDTO;
import com.smartmenu.app.smartmenu.dto.PedidoHistorial;
import com.smartmenu.app.smartmenu.entity.PedidoEntity;
import com.smartmenu.app.smartmenu.repository.PedidoRepository;
import com.smartmenu.app.smartmenu.repository.UsuarioRepository;
import com.smartmenu.app.smartmenu.service.HistorialService;

@Service
public class HistorialServiceImpl implements HistorialService {

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public HistorialDTO historial(String usuario) {

		HistorialDTO historial = new HistorialDTO();

		List<PedidoHistorial> historiales = new ArrayList<>();

		List<PedidoEntity> pedidos = pedidoRepository
				.findByIdusuario(usuarioRepository.findByUsuario(usuario).getIdUsuario().intValue());

		for (PedidoEntity pedidoEntity : pedidos) {
			PedidoHistorial pedidoHistorial = new PedidoHistorial();
			pedidoHistorial.setNumPedido(pedidoEntity.getIdpedido().intValue());
			pedidoHistorial.setFecha(getDateFormat(pedidoEntity.getFechapedido()));
			pedidoHistorial.setMonto(String.valueOf(pedidoEntity.getMontototalpedido()));
			historiales.add(pedidoHistorial);
		}

		historial.setHistorial(historiales);

		return historial;
	}

	private String getDateFormat(Date fechapedido) {

		String newstring = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fechapedido);

		return newstring;
	}

}
