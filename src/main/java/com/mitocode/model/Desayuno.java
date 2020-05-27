package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Desayuno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDesayuno;

	@ManyToOne
	private Producto producto;
	
	@ManyToOne
	private ValorNutricional valorNutri;

	public int getIdDesayuno() {
		return idDesayuno;
	}

	public void setIdDesayuno(int idDesayuno) {
		this.idDesayuno = idDesayuno;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}


}