package com.spring.springrest.service;

import java.util.List;

import com.spring.springrest.dto.Trabajador;

public interface ITrabajadorService {
	
	public List<Trabajador> listarTrabajadores();
	
	public Trabajador guardarTrabajador(Trabajador trabajador);
	
	public Trabajador trabajadorXID(Long id);
	
	public List<Trabajador> listarTrabajadorNombre(String nombre);
	
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	
	public void eliminarTrabajador(Long id);
}
