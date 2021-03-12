package sn.isi.service;

import sn.isi.entities.Consultant;


import java.util.Scanner;

public class IConsultantImpl implements IConsultant{

    private Scanner sc = new Scanner(System.in);

    /**
     * permet de saisir un Consultant et retourne le consultant saisi
     * @return un consultant
     */

    @Override
    public Consultant saisie() {
        Consultant c = new Consultant();
        System.out.println("-----------------------------Saisie de Consultat---------------------------------------------");
        System.out.println("Id");
        c.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le nom du consultat: ");
        c.setNom(sc.nextLine());
        System.out.println("Donner le Prenom du consultant");
        c.setPrenom(sc.nextLine());
        System.out.println("Donner le Password du consultant ");
        c.setPassword(sc.nextLine());
        System.out.println("Donner son email");
        c.setEmail(sc.nextLine());
        System.out.println("Entrer nombre heure: ");
        c.setNbHeure(sc.nextInt());
        System.out.println("Entrer le taux horaire: ");
        c.setTauxHoraire(sc.nextInt());
        return c;
    }

    /**
     * c'est pour afficher le consultant
     * @param c represente un consultant passé en parametre
     */

    @Override
    public void affiche(Consultant c) {
        System.out.println("-----------------------------les infos de Consultat---------------------------------------------");
        System.out.println("Id : "+c.getId());
        System.out.println("Nom: "+c.getNom());
        System.out.println("Prenom: "+c.getPrenom());
        System.out.println("Email: "+c.getEmail());
        //System.out.println("Password :"+c.getPassword());
        System.out.println("le nombre d'heure est: "+ c.getNbHeure());
        System.out.println("le taux est : "+c.getTauxHoraire());


    }
}
