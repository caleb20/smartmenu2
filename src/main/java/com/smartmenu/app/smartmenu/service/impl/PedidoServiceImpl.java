package com.smartmenu.app.smartmenu.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartmenu.app.smartmenu.dto.DetallePedidoInDTO;
import com.smartmenu.app.smartmenu.dto.DetallePedidoOutDTO;
import com.smartmenu.app.smartmenu.dto.PedidoInDTO;
import com.smartmenu.app.smartmenu.dto.PedidoOutDTO;
import com.smartmenu.app.smartmenu.entity.DetallePedidoEntity;
import com.smartmenu.app.smartmenu.entity.PedidoEntity;
import com.smartmenu.app.smartmenu.entity.StockEntity;
import com.smartmenu.app.smartmenu.repository.DetallePedidoRepository;
import com.smartmenu.app.smartmenu.repository.PedidoRepository;
import com.smartmenu.app.smartmenu.repository.PlatoRepository;
import com.smartmenu.app.smartmenu.repository.StockRepository;
import com.smartmenu.app.smartmenu.repository.UsuarioRepository;
import com.smartmenu.app.smartmenu.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	StockRepository stockRepository;

	@Autowired
	PlatoRepository platoRepository;

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	DetallePedidoRepository detallePedidoRepository;

	@Override
	public PedidoOutDTO pedido(PedidoInDTO pedido) {

		PedidoOutDTO pedidos = new PedidoOutDTO();
		List<DetallePedidoOutDTO> detallePedidos = new ArrayList<>();

		PedidoEntity pedidoEntity = new PedidoEntity();
		pedidoEntity.setIdusuario(usuarioRepository.findByUsuario(pedido.getUsuario()).getIdUsuario().intValue());
		pedidoEntity = pedidoRepository.save(pedidoEntity);

		boolean hayDetalle = false;

		for (DetallePedidoInDTO detalle : pedido.getDetalle()) {
			DetallePedidoOutDTO detalleOut = new DetallePedidoOutDTO();

			int cantidad = detalle.getCantidad();
			int cantidadRepo = stockRepository.findById(detalle.getIdPlato()).get().getCantidaddisponible();
			if (cantidad < cantidadRepo) {
				hayDetalle = true;
				int nuevoStock = cantidadRepo - cantidad;
				StockEntity stockEntity = stockRepository.findByCodplato(detalle.getIdPlato().intValue());
				stockEntity.setCantidaddisponible(nuevoStock);
				stockRepository.save(stockEntity);
				detalleOut.setIdPlato(detalle.getIdPlato());
				detalleOut.setNombrePlato(platoRepository.findById(detalle.getIdPlato()).get().getNom_plato());
				detalleOut.setPrecioxPlato(cantidad * platoRepository.findById(detalle.getIdPlato()).get().getPrecio());
				detalleOut.setCantidad(cantidad);
				detalleOut.setCodMensaje(0);
				detalleOut.setMensaje(
						platoRepository.findById(detalle.getIdPlato()).get().getNom_plato() + " Registrado con éxito");

				detallePedidos.add(detalleOut);
				DetallePedidoEntity detallePedidoEntity = new DetallePedidoEntity();
				detallePedidoEntity.setIdusuario(pedidoEntity.getIdusuario());
				detallePedidoEntity.setIdpedido(pedidoEntity.getIdpedido().intValue());
				detallePedidoEntity.setCodplato(detalle.getIdPlato().intValue());
				detallePedidoEntity.setCantidadvendida(cantidad);
				detallePedidoEntity.setPrecioxcantidad(String.valueOf(detalleOut.getPrecioxPlato()));

				detallePedidoRepository.save(detallePedidoEntity);
			} else {
				detalleOut.setCodMensaje(1);
				detalleOut.setMensaje(
						platoRepository.findById(detalle.getIdPlato()).get().getNom_plato() + " Sin stock disponible");
				detallePedidos.add(detalleOut);
			}
			pedidos.setDetalle(detallePedidos);
		}

		if (hayDetalle) {
			pedidoEntity.setFechapedido(new Date());
			pedidoEntity.setMontototalpedido(pedido.getMontoTotal());
			pedidoRepository.save(pedidoEntity);
		} else {
			pedidoRepository.delete(pedidoEntity);
		}

		return pedidos;
	}

}
