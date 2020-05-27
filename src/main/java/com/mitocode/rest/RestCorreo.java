package com.mitocode.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
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
import com.mitocode.model.Correo;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IAdicion;
import com.mitocode.repo.IUsuario;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import service.EmailServiceImpl;

import java.io.Console;

//import service.SendMailService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/correos")
public class RestCorreo {
	
	@Autowired
	public JavaMailSender emailSender;
	
	@GetMapping
	public void listar() {
		
	}

	@PostMapping
	public Correo sendMail(@RequestBody Correo datos) {
		
		String cuerpo = datos.getCuerpo() +"\n\n Datos de contacto: " + "\nNombre: " + datos.getNombre() + "\nE-mail: " + datos.getCorreo();          
		SimpleMailMessage mensaje = new SimpleMailMessage(); 	
		mensaje.setTo("pruebasCorreo123456789123@gmail.com"); 
		mensaje.setSubject(datos.getAsunto()); 
		mensaje.setText(cuerpo);
		emailSender.send(mensaje);	
		return datos;
		
	}

	@PutMapping
	public void modificar(@RequestBody Adicion adi) {
		
	}

	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		
	}

}
