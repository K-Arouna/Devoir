package sn.isi.entities;

public class maSpecialite {
    private int id;
    private String nom;

    public Specialite(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Specialite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}