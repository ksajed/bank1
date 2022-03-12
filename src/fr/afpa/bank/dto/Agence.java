package fr.afpa.bank.dto;


import fr.afpa.bank.dao.Dao;

public class Agence {

    private int code;
    private String nom;
    private String adressePostale;
    private String codePostal;
    private String ville;

    public Agence() {
        setCode();
    }

    public Agence(String nom, String adressePostale, String codePostal, String ville) {
        setCode();
        this.nom = nom;
        this.adressePostale = adressePostale;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getCode() {
        return code;
    }
    public void setCode() {
        this.code= Dao.generatedCodeAgence();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
