package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class OtrosProductos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOtroProducto;

	@ManyToOne
	private ValorNutricional valorNutri;

	public int getIdOtroProducto() {
		return idOtroProducto;
	}

	public void setIdOtroProducto(int idOtroProducto) {
		this.idOtroProducto = idOtroProducto;
	}

	public ValorNutricional getValorNutri() {
		return valorNutri;
	}

	public void setValorNutri(ValorNutricional valorNutri) {
		this.valorNutri = valorNutri;
	}
	
	
}