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

import com.mitocode.model.Adicion;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IAdicion;
import com.mitocode.repo.IUsuario;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/adiciones")
public class RestAdicion {

	@Autowired
	private IAdicion repo;

	@GetMapping
	public List<Adicion> listar() {
		return repo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Adicion adi) {
		repo.save(adi);

	}

	@PutMapping
	public void modificar(@RequestBody Adicion adi) {
		repo.save(adi);
	}

	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
