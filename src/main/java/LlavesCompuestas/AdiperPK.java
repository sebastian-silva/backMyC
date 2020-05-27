package LlavesCompuestas;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AdiperPK implements Serializable {

	private int personalizadoId;
	private int  adicionId;
	
	public AdiperPK() {
		
	}
	
	public AdiperPK(int personalizadoId, int adicionId) {
		super();
		this.personalizadoId = personalizadoId;
		this.adicionId = adicionId;
	}



	public long getPersonalizadoId() {
		return personalizadoId;
	}

	public void setPersonalizadoId(int personalizadoId) {
		this.personalizadoId = personalizadoId;
	}

	public long getAdicionId() {
		return adicionId;
	}

	public void setAdicionId(int adicionId) {
		this.adicionId = adicionId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (adicionId ^ (adicionId >>> 32));
		result = prime * result + (int) (personalizadoId ^ (personalizadoId >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdiperPK other = (AdiperPK) obj;
		if (adicionId != other.adicionId)
			return false;
		if (personalizadoId != other.personalizadoId)
			return false;
		return true;
	}
	
}
