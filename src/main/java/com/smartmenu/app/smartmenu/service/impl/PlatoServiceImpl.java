package com.smartmenu.app.smartmenu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartmenu.app.smartmenu.dto.PlatoDTO;
import com.smartmenu.app.smartmenu.entity.PlatoEntity;
import com.smartmenu.app.smartmenu.repository.PlatoRepository;
import com.smartmenu.app.smartmenu.service.PlatoService;

@Service
public class PlatoServiceImpl implements PlatoService {

	@Autowired
	PlatoRepository platoRepository;

	@Override
	public List<PlatoDTO> obtenerTodos() {

		List<PlatoEntity> platosEntity = platoRepository.findAll();
		List<PlatoDTO> platos = new ArrayList<>();

		for (PlatoEntity platoEntity : platosEntity) {
			PlatoDTO plato = new PlatoDTO();
			plato.setNombrePlato(platoEntity.getNom_plato());
			plato.setCodTipoPlato(platoEntity.getTipo_plato());
			plato.setTipoPlato(getTipo(platoEntity.getTipo_plato()));
			plato.setDescripcionPlato(platoEntity.getDescripcion_plato());
			plato.setImagenPlato(platoEntity.getImagen());
			platos.add(plato);
		}

		return platos;
	}

	private String getTipo(int tipo_plato) {
		String tipo = "";

		switch (tipo_plato) {
		case 1:
			tipo = "Fondo";
			break;
		case 2:
			tipo = "Entrada";
			break;
		default:
			tipo = "Postre";
			break;
		}

		return tipo;
	}

}
