package com.mitocode.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.repo.IPersonaRepo;
import java.util.List;
import com.mitocode.model.Persona;

@RestController
@RequestMapping("/personas")
public class RestDemoController {	
	
	@Autowired
	private IPersonaRepo repo;
	
	
	@GetMapping//obtener datos 
	public List <Persona>listar(){
		List<String> todos=repo.findAllActiveUsersNative(3);
		/*
		System.out.println(todos.get(0));
		System.out.println(todos.get(1));
		String id;
		String nombre;
		for(int i=0;i<todos.size();i++) {
			String[] parts= todos.get(i).split(",");
			System.out.println("La persona"+i+"Tiene un id de " );
			System.out.println(parts[0]);
			System.out.println("La persona"+i+"Tiene un nombre de");
			System.out.println(parts[1]);
		}*/
		if(todos.size()>0) {
		for(int i=0;i<todos.size();i++) {
			String[] parts= todos.get(i).split(",");
			System.out.println("La persona"+i+"Tiene un id de " );
			System.out.println(parts[0]);
			System.out.println("La persona"+i+"Tiene un nombre de");
			System.out.println(parts[1]);
		}}else
			System.out.println("No existen personas con ese id" );
		return repo.findAll();		
	}
	
		
	// @RequestBody para cambiar de Json a un objeto en java
	@PostMapping// insertar datos
	public void insertar( @RequestBody Persona per){
		repo.save(per);		
	}
	
	@PutMapping// modificar datos 
	public void modificar( @RequestBody Persona per){
		repo.save(per); // save se base de la llave primaria, y si la encuentra cambia esos datos		
	}
	
	// eliminar datos @PathVariable: variable a capturar
	@DeleteMapping(value="/{id}")     
	public void borrar(@PathVariable("id")Integer id){ 
		repo.deleteById(id);	
	}
	
	
}
