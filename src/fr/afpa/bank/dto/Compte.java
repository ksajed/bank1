package fr.afpa.bank.dto;

public class Compte {
    public final static String TYPE_COMPTE_COURANT = "CC";
    public final static String TYPE_LIVRET_A = "LA";
    public final static String TYPE_PLAN_EPARGNE = "PEL";

    private int numero;
    private double solde;
    private boolean decouvertAutorise;
    private String typeCompte;
    private Agence agence;
    private Client client;

    public Compte(double solde, boolean decouvertAutorise, String typeCompte, Agence agence, Client client) {
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
        this.typeCompte = typeCompte;
        this.agence = agence;
        this.client = client;
    }

    public Compte() {
    }

    public int getNumero() {
        return numero;
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

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", decouvertAutorise=" + decouvertAutorise +
                ", typeCompte='" + typeCompte + '\'' +
                ", agence=" + agence +
                ", client=" + client +
                '}';
    }
}
