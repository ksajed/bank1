package fr.afpa.bank.dto;

public class Compte {
    public final static String TYPE_COMPTE_COURANT = "CC";
    public final static String TYPE_LIVRET_A = "LA";
    public final static String TYPE_PLAN_EPARGNE = "PEL";

    private int numero;
    private double solde;
    private boolean decouvertAutorise;
    private String typeCompte;
    private int IdAgence;
    private String IdClient;

    public Compte() {
    }

    public Compte(int numero, double solde, boolean decouvertAutorise, String typeCompte, int idAgence, String idClient) {
        this.numero = numero;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
        this.typeCompte = typeCompte;
        IdAgence = idAgence;
        IdClient = idClient;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(boolean decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public int getIdAgence() {
        return IdAgence;
    }

    public void setIdAgence(int idAgence) {
        IdAgence = idAgence;
    }

    public String getIdClient() {
        return IdClient;
    }

    public void setIdClient(String idClient) {
        IdClient = idClient;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", decouvertAutorise=" + decouvertAutorise +
                ", typeCompte='" + typeCompte + '\'' +
                ", IdAgence=" + IdAgence +
                ", IdClient='" + IdClient + '\'' +
                '}';
    }
}
