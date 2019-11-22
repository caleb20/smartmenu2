package com.smartmenu.app.smartmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartmenu.app.smartmenu.entity.TrabajadorEntity;

@Repository
public interface TrabajadorRepository extends JpaRepository<TrabajadorEntity, Long>{

}
