package com.spring.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springrest.dao.ITrabajadorDAO;
import com.spring.springrest.dto.Trabajador;

public class TrabajadorServiceImpl implements ITrabajadorService{

	
	@Autowired
	ITrabajadorDAO ITrabajadorDAO;
	
	@Override
	public List<Trabajador> listarTrabajadores() {
		
		return ITrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		
		return ITrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorXID(Long id) {
		
		return ITrabajadorDAO.findById(id).get();
	}
	

	@Override
	public Trabajador actualizarTrabajador(Trabajador cliente) {
		
		return ITrabajadorDAO.save(cliente);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		
		ITrabajadorDAO.deleteById(id);
		
	}

	@Override
	public List<Trabajador> listarTrabajadorNombre(String nombre) {
		
		return ITrabajadorDAO.findByNombre(nombre);
	}
}
