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
import com.mitocode.model.Usuario;
import com.mitocode.repo.IAdicion;
import com.mitocode.repo.IUsuario;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import service.EmailServiceImpl;

//import service.SendMailService;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/correos")
public class RestCorreo {
	
	@Autowired
	public JavaMailSender emailSender;
	
	@GetMapping
	public void listar() {
		
	}

	@PostMapping
	public String sendMail(@RequestBody String nombre, String correo, String asunto, String cuerpo) {
		System.out.println(nombre);
		String message = cuerpo +"\n\n Datos de contacto: " + "\nNombre: " + nombre + "\nE-mail: " + correo;          
		SimpleMailMessage mensaje = new SimpleMailMessage(); 
		
		mensaje.setTo("casesime2.1@gmail.com"); 
		mensaje.setSubject("Hola"); 
		mensaje.setText("Esto es algo mas largo para comprobar");
		emailSender.send(mensaje);
		return message;
	}

	@PutMapping
	public void modificar(@RequestBody Adicion adi) {
		
	}

	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		
	}

}
