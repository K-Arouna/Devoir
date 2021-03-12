package sn.isi.entities;

import java.util.Scanner;

public class MedecinChef extends Medecin{
    private String bureau;
    private Medecin medecin;
    private Scanner sc = new Scanner(System.in);

    public MedecinChef(int id, String nom, String prenom, Services service, String bureau) {
        super(id, nom, prenom, service);
        this.bureau = bureau;
    }

    public MedecinChef() {
        super();
    }

    public MedecinChef(String bureau) {
        this.bureau = bureau;
    }

    public MedecinChef(Services service, String bureau) {
        super(service);
        this.bureau = bureau;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public Medecin saisieMedChef(){
        System.out.println("--------------------Saisir le Medecin Chef--------------------");
        Services s = new Services();
        MedecinChef mchef = new MedecinChef();
        System.out.println("Entrer son id: ");
        mchef.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom: ");
        mchef.setNom(sc.nextLine());
        System.out.println("Donner le Prenom: ");
        mchef.setPrenom(sc.nextLine());
        System.out.println("Donner Son Bureau: ");
        mchef.setBureau(sc.nextLine());
        System.out.println("Entrer l'ID du service: ");
        s.setIdS(sc.nextInt());
        sc.nextLine();
        System.out.println("Donner le Nom du service: ");
        s.setNomS(sc.nextLine());
        mchef.setService(s);
        medecin = mchef;
        return medecin;
    }

    public void afficheMedchef(){
        System.out.println("--------------------Affichage du Medecin Chef--------------------");
        System.out.println("L'ID du Medecin Chef est: "+this.getId());
        System.out.println("Le nom du Medecin Chef est: "+this.getNom());
        System.out.println("Le prenom du Medecin Chef est: "+this.getPrenom());
        System.out.println("Sa Specialite du Medecin Chef est: "+this.getBureau());
        System.out.println("L'ID de son service est: "+this.getService().getIdS());
        System.out.println("Le nom de son service est: "+this.getService().getNomS());
    }
}
