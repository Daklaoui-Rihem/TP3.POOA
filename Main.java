package gestionprojet;

public class Main {

    public static void main(String[] args) {

        Employe e1 = new Employe(11464772, 11.255, 123);
        Employe e2 = new Employe(12387862, 4.000, 456);
        Employe e3 = new Employe(15253803, 20.500, 456);
        Employe e4 = new Employe(15253804, 5.000, 123);

        Departement dep = new Departement(123);
        Departement dep1 = new Departement(456);

        dep.ajoutEmploye(e1);
        dep1.ajoutEmploye(e2);
        dep.ajoutEmploye(e3);
        dep1.ajoutEmploye(e4);

        System.out.println("Dep 1:");
        dep.afficheDep();
        System.out.println("Dep 2:");
        dep1.afficheDep();

        System.out.println("Existe:");
        System.out.println(dep.existeE(11464772));

        System.out.println("Max Salaire:");
        System.out.println(dep.getEmpSalMax());

        Entreprise entreprise = new Entreprise("TechCorp");

        entreprise.ajoutDep(dep);
        entreprise.ajoutDep(dep1);

        System.out.println("Existe :" + entreprise.existeD(dep));

        System.out.println("Transfert");
        entreprise.UpdateDep(e4, 123);

        System.out.println("Dep 1 apres transfert:");
        dep.afficheDep();
        System.out.println("Dep 2 apres transfert:");
        dep1.afficheDep();

        System.out.println("Min capacite");
        entreprise.DepMinCapacity();
    }
}
