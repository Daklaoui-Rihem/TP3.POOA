package gestionprojet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	
	private int idDep;
	Set<Employe> LEmployes;
	
	public Departement(int idDep) {
		this.idDep=idDep;
		LEmployes=new HashSet<>();
	}
	
	
	public int getIdDep() {
		return idDep;
	}



	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}



	public Set<Employe> getLEmployes() {
		return LEmployes;
	}



	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}



	public void ajoutEmploye(Employe E)
	{
		if(E.getCin()>0)
		{
			LEmployes.add(E);
			E.setIdDep(idDep);
		}
	}
	
	public void retirerEmploye(Employe E)
	{
		LEmployes.remove(E);
	}
	
	public void afficheDep()
	{
		System.out.println(idDep);
		for (Employe employe : LEmployes) {
			System.out.println(employe);
		}
	}
	
	public boolean existeE(int cin)
	{
		Employe e=new Employe(cin,1.1,123);
		return LEmployes.contains(e);
	}
	
	public Employe getEmpSalMax()
	{
		TreeSet<Employe> ts=new TreeSet<>(LEmployes);
		return ts.last();
	}
}
