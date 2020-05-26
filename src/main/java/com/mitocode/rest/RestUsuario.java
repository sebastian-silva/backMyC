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

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuario;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/usuarios")
public class RestUsuario {

	@Autowired
	private IUsuario repo;

	@GetMapping
	public List<Usuario> listar() {
		return repo.findAll();
	}
	
	@PostMapping
	public Usuario insertar(@RequestBody Usuario user) {
		Usuario tempo = new Usuario();
		if (user.getIdUsuario() == 0) {
			int valor = repo.comprobarCorreo(user.getCorreo(), user.getClave());
			 System.out.print(user.getCorreo() + user.getClave());
			 switch (valor) {
			case 1:
				tempo.setPuntos(valor);
				break;
			case 2:
				tempo.setPuntos(valor);
					break;
			case 3:
				tempo.setPuntos(valor);
				break;
			default:
				break;
			}
		} else {
			int valor = repo.isRegistrado(user.getCorreo());
			if (valor == 0) {
				repo.save(user);
			}
			tempo.setPuntos(valor);
		}
		return tempo;
	}

	@PutMapping
	public void modificar(@RequestBody Usuario user) {
		repo.save(user);
	}

	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
