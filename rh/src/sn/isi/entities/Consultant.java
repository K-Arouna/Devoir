package sn.isi.entities;

public class Consultant extends Personne{
    private int nbHeure;
    private double tauxHoraire;

    public Consultant(int id, int etat, String nom, String prenom, String email, String password,int nbHeure, double tauxHoraire) {
        super( id, etat,  nom, prenom,  email, password);
        this.nbHeure = nbHeure;
        this.tauxHoraire = tauxHoraire;

    }

    public Consultant() {
        super();
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
