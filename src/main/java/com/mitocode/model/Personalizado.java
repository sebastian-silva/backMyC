package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Personalizado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersonalizado;

	@ManyToOne
	private Producto producto;

	public int getIdPersonalizado() {
		return idPersonalizado;
	}

	public void setIdPersonalizado(int idPersonalizado) {
		this.idPersonalizado = idPersonalizado;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}