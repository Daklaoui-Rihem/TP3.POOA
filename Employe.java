package gestionprojet;

import java.util.Objects;

public class Employe implements Comparable<Employe>{
	
	private int cin;
	private double salaire;
	private int idDep;
	
	public Employe(int cin, double salaire, int idDep) {
		this.cin = cin;
		this.salaire = salaire;
		this.idDep = idDep;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", salaire=" + salaire + ", idDep=" + idDep + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return cin == other.cin;
	}

	@Override
	public int compareTo(Employe o) {
		if(salaire>o.getSalaire())
		{
			return 1;
		}
		if(salaire<o.getSalaire())
		{
			return -1;
		}
		return 0;
	}
}
