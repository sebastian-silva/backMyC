package LlavesCompuestas;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class DesayunoFavPK implements Serializable {

	private int idFavorito;
	private int idDesayuno;
	private int idOtrop;
	
	public DesayunoFavPK() {
		
	}
	
	public DesayunoFavPK(int idFavorito, int idDesayuno, int idOtrop ) {
		super();
		this.idFavorito = idFavorito;
		this.idDesayuno = idDesayuno;
		this.idOtrop=idOtrop;
	}

	public int getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
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
