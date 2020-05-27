package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity

public class ValorNutricional {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idValorNutricional;
	
	@Column(name="grasa")
	private String grasa;
	
	@Column(name="azucar")
	private int azucar;
	
	@Column(name="sal")
	private int sal;
	
	@Column(name="proteina")
	private int proteina;

	public int getIdValorNutricional() {
		return idValorNutricional;
	}

	public void setIdValorNutricional(int idValorNutricional) {
		this.idValorNutricional = idValorNutricional;
	}

	public String getGrasa() {
		return grasa;
	}

	public void setGrasa(String grasa) {
		this.grasa = grasa;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getProteina() {
		return proteina;
	}

	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	
	
	// @JoinColumn  sirve para crear la relacion entre las tablas y mappedBy indica el inverso de la relacion 
}
