package com.smartmenu.app.smartmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartmenu.app.smartmenu.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByUsuario(String usuario);

	UsuarioEntity findByUsuarioAndClaveUsuario(String usuario, String pass);

}
