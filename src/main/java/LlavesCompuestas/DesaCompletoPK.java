package LlavesCompuestas;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class DesaCompletoPK implements Serializable {

	private int idDesayuno;
	private int  idOtrop;
	
	public DesaCompletoPK() {
		
	}
	
	public DesaCompletoPK(int personalizadoId, int adicionId) {
		super();
		this.idDesayuno = idDesayuno;
		this.idOtrop = idOtrop;
	}
	
	
	public int getIdDesayuno() {
		return idDesayuno;
	}

	public void setIdDesayuno(int idDesayuno) {
		this.idDesayuno = idDesayuno;
	}

	public int getIdOtrop() {
		return idOtrop;
	}

	public void setIdOtrop(int idOtrop) {
		this.idOtrop = idOtrop;
	}

	
}
