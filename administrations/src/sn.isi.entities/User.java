package sn.isi.entities;

public class User {
    private String nom,prenom,email,password;
    private Integer idU, etat;

    public User(){

    }

    public User(String nom, String prenom, String email, String password, Integer id, Integer etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.idU = id;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdU() {
        return idU;
    }

    public void setIdU(Integer id) {
        this.idU = id;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }
}
