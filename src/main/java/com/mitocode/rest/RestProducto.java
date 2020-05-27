package com.mitocode.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Producto;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IProducto;
import com.mitocode.repo.IUsuario;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/productos")
public class RestProducto {

	@Autowired
	private IProducto repo;

	@GetMapping
	public List<Producto> listar() {
		return repo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Producto produc) {
		repo.save(produc);
	}

	@PutMapping
	public void modificar(@RequestBody Producto produc) {
		repo.save(produc);
	}

	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}