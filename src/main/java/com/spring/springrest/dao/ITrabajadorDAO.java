package com.spring.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springrest.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long> {
	
	public List<Trabajador> findByNombre(String nombre);
	
}
