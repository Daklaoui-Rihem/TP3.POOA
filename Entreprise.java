package gestionprojet;

import java.util.HashMap;

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
		
	public void DepMinCapacity()
	{
		Departement mindep = null;
		int mincap = Integer.MAX_VALUE;

    for (Departement d : Liste_Deps.values()) {
        if (d.getLEmployes().size() < mincap) {
            mincap = d.getLEmployes().size();
            mindep = d;
        }
    }
    mindep.afficheDep();
	}
}

