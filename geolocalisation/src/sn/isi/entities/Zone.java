package sn.isi.entities;

public class Zone {
    private int id;
    private String nom;
    private double longitude;
    private double latitude;

    public Zone() {
    }

    public Zone(int id, String nom, double longitude, double latitude) {
        this.id = id;
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
