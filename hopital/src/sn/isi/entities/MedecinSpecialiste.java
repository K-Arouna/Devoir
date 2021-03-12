package sn.isi.entities;

import java.util.Scanner;

public class MedecinSpecialiste extends Medecin{
    private String specialite;
    private Medecin medecin;
    private Scanner sc = new Scanner(System.in);
    public MedecinSpecialiste(int id, String nom, String prenom, Services service, String specialite) {
        super(id, nom, prenom, service);
        this.specialite = specialite;
    }

    public MedecinSpecialiste() {
        super();
    }

    public MedecinSpecialiste(String specialite) {
        this.specialite = specialite;
    }

    public MedecinSpecialiste(Services service, String specialite) {
        super(service);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public Medecin saisieMedSpec(){
        Services s = new Services();
        MedecinSpecialiste ms = new MedecinSpecialiste();
        System.out.println("--------------------Saisir le Medecin Specialiste--------------------");
        System.out.println("Entrer son id: ");
        this.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom: ");
        this.setNom(sc.nextLine());
        System.out.println("Donner le Prenom: ");
        this.setPrenom(sc.nextLine());
        System.out.println("Donner sa Specialite: ");
        this.setSpecialite(sc.nextLine());
        System.out.println("Entrer l'ID du service: ");
        s.setIdS(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom du service: ");
        s.setNomS(sc.nextLine());
        this.setService(s);
        medecin = ms;
        return medecin;
    }

    public void afficheMedSpe(){

        System.out.println("--------------------Affichage du Medecin Specialiste--------------------");
        System.out.println("L'ID du Medecin Generaliste est: "+this.getId());
        System.out.println("Le nom du Medecin Generaliste est: "+this.getNom());
        System.out.println("Le prenom du Medecin Generaliste est: "+this.getPrenom());
        System.out.println("Sa Specialite du Medecin Generaliste est: "+this.getSpecialite());
        System.out.println("L'ID de son service est: "+this.getService().getIdS());
        System.out.println("Le nom de son service est: "+this.getService().getNomS());

    }
}
