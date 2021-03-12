package sn.isi.entities;

public class Services {

    private int ids;
    private String nom;

    public Services() {
    }

    public Services(int id, String nom) {
        this.ids = id;
        this.nom = nom;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int id) {
        this.ids = id;
    }

    public String getNomS() {
        return nom;
    }

    public void setNomS(String nom) {
        this.nom = nom;
    }
}
