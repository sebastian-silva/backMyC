package LlavesCompuestas;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class PersonalizadoFavPK implements Serializable {

	private int idFavorito;
	private int  personalizadoId;
	private int  adicionId;
	
	public PersonalizadoFavPK() {
		
	}
	
	public PersonalizadoFavPK(int idFavorito, int personalizadoId, int adicionId ) {
		super();
		this.idFavorito = idFavorito;
		this.personalizadoId = personalizadoId;
		this.adicionId= adicionId;
	}

	public int getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	public int getPersonalizadoId() {
		return personalizadoId;
	}

	public void setPersonalizadoId(int personalizadoId) {
		this.personalizadoId = personalizadoId;
	}

	public int getAdicionId() {
		return adicionId;
	}

	public void setAdicionId(int adicionId) {
		this.adicionId = adicionId;
	}
	
	
}
