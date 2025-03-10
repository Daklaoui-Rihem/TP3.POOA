package gestionprojet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Entreprise {
	

	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;
	public Entreprise(String nomEntreprise) {
		this.nomEntreprise=nomEntreprise;
		Liste_Deps = new HashMap<>();
	}
	
	public void ajoutDep(Departement d)
	{
		Liste_Deps.put(d.getIdDep(), d);
	}
	
	public void retirerDep(Departement d)
	{
		Liste_Deps.remove(d);
	}

	public void afficheE()
	{
		System.out.println(nomEntreprise);
		
	}

	public void UpdateDep(Employe E, int idDep) {
    if (!Liste_Deps.containsKey(idDep)) {
        System.out.println("Le département avec l'ID " + idDep + " n'existe pas.");
    }
	else{
		Departement ancdep = Liste_Deps.get(E.getIdDep());
        ancdep.retirerEmploye(E);
        Departement nouvdep = Liste_Deps.get(idDep);
        nouvdep.ajoutEmploye(E);
        E.setIdDep(idDep);
		System.out.println("L'employé a été transféré au département " + idDep);
	}
	}
	
	public boolean existeD(Departement d)
	{
		return Liste_Deps.containsKey(d.getIdDep());
	}
		
	public void DepMinCapacity() {
		TreeMap<Integer,Departement> tri = new TreeMap<>();
		for (Departement d: Liste_Deps.values()) {
			tri.put(d.getLEmployes().size(), d);
		}
		Map.Entry<Integer,Departement> pEntry = tri.firstEntry();
		Departement min= pEntry.getValue();
		min.afficheDep();
  }
}

