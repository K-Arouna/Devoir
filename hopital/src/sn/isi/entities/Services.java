package sn.isi.entities;

public class Services {
    private int idS;
    private String nomS;

    public Services(int id, String nom) {
        this.idS = id;
        this.nomS = nom;
    }

    public Services() {
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int id) {
        this.idS = id;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nom) {
        this.nomS = nom;
    }
}
