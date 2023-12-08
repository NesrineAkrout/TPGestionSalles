package metier;

import java.util.Objects;

public class Salle {
	private int id;
	private String code;
	private String libelle;
 
	private static int comp=0;
    
	public Salle(String code, String libelle) {
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return this.id+" "+this.code + " " + this.libelle;
	}
	@Override
	public int hashCode() {
		return Objects.hash(code, libelle);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salle other = (Salle) obj;
		return Objects.equals(code, other.code) && Objects.equals(libelle, other.libelle);
	}
	
}
