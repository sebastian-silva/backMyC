package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Adicion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdicion;
	
	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="precio")
	private int precio;
	
	@Column(name="puntos")
	private int puntos;
	
	@ManyToOne
	private ValorNutricional Valornutri;
	
	@ManyToOne
	private ModeloImagen modeloImagen;
	
	
	public int getIdAdicion() {
		return idAdicion;
	}

	public void setIdAdicion(int idAdicion) {
		this.idAdicion = idAdicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public ValorNutricional getValornutri() {
		return Valornutri;
	}

	public void setValornutri(ValorNutricional valornutri) {
		Valornutri = valornutri;
	}

	public ModeloImagen getModeloImagen() {
		return modeloImagen;
	}

	public void setModeloImagen(ModeloImagen modeloImagen) {
		this.modeloImagen = modeloImagen;
	}
	
	
	
	
}