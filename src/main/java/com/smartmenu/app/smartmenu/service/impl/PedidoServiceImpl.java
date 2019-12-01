package com.smartmenu.app.smartmenu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartmenu.app.smartmenu.dto.DetallePedidoDTO;
import com.smartmenu.app.smartmenu.dto.Mensaje;
import com.smartmenu.app.smartmenu.dto.PedidoInDTO;
import com.smartmenu.app.smartmenu.entity.StockEntity;
import com.smartmenu.app.smartmenu.repository.PlatoRepository;
import com.smartmenu.app.smartmenu.repository.StockRepository;
import com.smartmenu.app.smartmenu.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	StockRepository stockRepository;

	@Autowired
	PlatoRepository platoRepository;

	@Override
	public List<Mensaje> mensajes(PedidoInDTO pedido) {

		List<Mensaje> mensajes = new ArrayList<>();

		for (DetallePedidoDTO detalle : pedido.getDetalle()) {
			Mensaje mensaje = new Mensaje();
			int cantidad = detalle.getCantidad();
			int cantidadRepo = stockRepository.findById(detalle.getIdPlato()).get().getCantidaddisponible();
			if (cantidad < cantidadRepo) {
				int nuevoStock = cantidadRepo - cantidad;
				StockEntity stockEntity = stockRepository.findByCodplato(detalle.getIdPlato().intValue());
				stockEntity.setCantidaddisponible(nuevoStock);
				stockRepository.save(stockEntity);
				mensaje.setMensaje(
						platoRepository.findById(detalle.getIdPlato()).get().getNom_plato() + " Registrado con éxito");
				mensajes.add(mensaje);
			} else {
				mensaje.setMensaje(
						platoRepository.findById(detalle.getIdPlato()).get().getNom_plato() + " Sin stock disponible");
				mensajes.add(mensaje);
			}
		}

		return mensajes;
	}

}
