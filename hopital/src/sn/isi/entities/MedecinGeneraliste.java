package sn.isi.entities;

import java.util.Scanner;

public class MedecinGeneraliste extends Medecin{
    private String listeSpecialite;
    private Scanner sc = new Scanner(System.in);
    Medecin medecin = null;

    public MedecinGeneraliste(int id, String nom, String prenom, Services service, String listeSpecialite) {
        super(id, nom, prenom, service);
        this.listeSpecialite = listeSpecialite;
    }

    public MedecinGeneraliste(String listeSpecialite) {
        this.listeSpecialite = listeSpecialite;
    }

    public MedecinGeneraliste() {
        super();
    }

    public MedecinGeneraliste(Services service, String listeSpecialite) {
        super(service);
        this.listeSpecialite = listeSpecialite;
    }

    public String getListeSpecialite() {
        return listeSpecialite;
    }

    public void setListeSpecialite(String listeSpecialite) {
        this.listeSpecialite = listeSpecialite;
    }

    public Medecin saisieMedGen(){
        Services s = new Services();
        System.out.println("--------------------Saisir le Medecin Generaliste--------------------");
        MedecinGeneraliste mg = new MedecinGeneraliste();
        System.out.println("Entrer son id: ");
        mg.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom: ");
        mg.setNom(sc.nextLine());
        System.out.println("Donner le Prenom: ");
        mg.setPrenom(sc.nextLine());
        System.out.println("Donner la specialiste du Medecin: ");
        mg.setListeSpecialite(sc.nextLine());
        System.out.println("Entrer l'ID du service: ");
        s.setIdS(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom du service: ");
        s.setNomS(sc.nextLine());
        mg.setService(s);
        medecin = mg;
        return medecin;
    }

    public void afficheMedGen(){
        MedecinGeneraliste mg = new MedecinGeneraliste();
        System.out.println("--------------------Affichage du Medecin Generaliste--------------------");
        System.out.println("L'ID du Medecin Generaliste est: "+this.getId());
        System.out.println("Le nom du Medecin Generaliste est: "+this.getNom());
        System.out.println("Le prenom du Medecin Generaliste est: "+this.getPrenom());
        System.out.println("La specialité du Medecin Generaliste est: "+this.getListeSpecialite());
        System.out.println("L'ID de son service est: "+this.getService().getIdS());
        System.out.println("Le nom de son service est: "+this.getService().getNomS());
    }
}
