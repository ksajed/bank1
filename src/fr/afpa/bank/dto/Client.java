package fr.afpa.bank.dto;

import fr.afpa.bank.dao.DaoUtils;

import java.util.Date;

public class Client {
    private String id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;

    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public  void setId(){

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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", email='" + email + '\'' +
                '}';
    }
}
