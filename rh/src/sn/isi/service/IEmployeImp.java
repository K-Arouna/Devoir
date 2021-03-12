package sn.isi.service;

import sn.isi.entities.Employe;
import sn.isi.entities.Services;

import java.util.Scanner;

public class IEmployeImp implements IEmploye{

    private Scanner sc = new Scanner(System.in);

    /**
     *  permet de saisir un employe et retourne le employe saisi
     * @return un epmloyer saisi en parametre
     */
    @Override
    public Employe saisie() {
        System.out.println("-----------------------------Saisie d'Employer---------------------------------------------");
        Services s= new Services(1,null);
        Employe e= new Employe();
        System.out.println("Donner l'ID de l'Employe : ");
        e.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le nom de l'Employe: ");
        e.setNom(sc.nextLine());
        System.out.println("Donner le Prenom de l'Employe: ");
        e.setPrenom(sc.nextLine());
        System.out.println("Donner le Email de l'Employe: ");
        e.setEmail(sc.nextLine());
        System.out.println("Password de l'Employe: ");
        e.setPassword(sc.nextLine());
        System.out.println("Donner l'Etat de l'Employe: ");
        e.setEtat(sc.nextInt());
        System.out.println("saisir l'id service: ");
        s.setIds(sc.nextInt());
        sc.nextLine();
        System.out.println("saisir le nom du service: ");
        s.setNomS(sc.nextLine());

        e.setService(s);

        return e;
    }

    /**
     * premet d'afficher l'employer passer en parametre
     * @param e represente un employer
     */
    @Override
    public void affiche(Employe e) {
        System.out.println("-----------------------------les infos de Employe---------------------------------------------");
        System.out.println("L'id est: "+e.getId());
        System.out.println("Le Nom est: "+e.getNom());
        System.out.println("Le Prenom est: "+e.getPrenom());
        System.out.println("L'email : "+e.getEmail());
        System.out.println("L'Etat est : "+e.getEtat());
        System.out.println("Le Mot de Passe est : "+e.getPassword());
        System.out.println("Le Service est : "+e.getService().getIds());
        System.out.println("Le Service est : "+e.getService().getNomS());
    }
}
