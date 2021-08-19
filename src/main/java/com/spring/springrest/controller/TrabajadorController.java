package com.spring.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.springrest.dto.Trabajador;
import com.spring.springrest.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
		
		@Autowired
		TrabajadorServiceImpl trabajadorServiceImpl;
		
		@GetMapping("/trabajadores")
		public List<Trabajador> listarTrabajadores(){
			return trabajadorServiceImpl.listarTrabajadores();
		}
		
		//listar Clientes por campo nombre
		@GetMapping("/trabajadores/nombre/{nombre}")
		public List<Trabajador> listarTrabajadoresNombre(@PathVariable(name="nombre") String nombre) {
		    return trabajadorServiceImpl.listarTrabajadorNombre(nombre);
		}
		
		
		@PostMapping("/trabajadores")
		public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
			
			return trabajadorServiceImpl.guardarTrabajador(trabajador);
		}
		
		
		@GetMapping("/trabajadores/{id}")
		public Trabajador trabajadorXID(@PathVariable(name="id") Long id) {
			
			Trabajador trabajador_xid= new Trabajador();
			
			trabajador_xid=trabajadorServiceImpl.trabajadorXID(id);
			
			System.out.println("Trabajador XID: "+trabajador_xid);
			
			return trabajador_xid;
		}
		
		@PutMapping("/trabajadores/{id}")
		public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
			
			Trabajador trabajador_seleccionado= new Trabajador();
			Trabajador trabajador_actualizado= new Trabajador();
			
			trabajador_seleccionado= trabajadorServiceImpl.trabajadorXID(id);
			
			trabajador_seleccionado.setNombre(trabajador.getNombre());
			trabajador_seleccionado.setApellido(trabajador.getApellido());
			trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
			
			trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
			
			System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
			
			return trabajador_actualizado;
		}
		
		@DeleteMapping("/trabajadores/{id}")
		public void eleiminarTrabajador(@PathVariable(name="id")Long id) {
			trabajadorServiceImpl.eliminarTrabajador(id);
		}
}
