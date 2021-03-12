package sn.isi.entities;


public class Employe extends Personne{
    Services service;

    public Employe(int id, int etat, String nom, String prenom, String email, String password, Services service) {
        super(id, etat, nom, prenom, email, password);
        this.service = service;
    }

    public Employe() {

    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}