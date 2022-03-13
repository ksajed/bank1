package fr.afpa.bank.controllers;

import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.CompteDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.views.ClientView;
import fr.afpa.bank.views.CompteView;

import java.io.IOException;

public class CompteController {


    CompteDao CompteDao = new CompteDao();
    static CompteView compteView = new CompteView();

    /**
     * recuperer les informations de client a creer aprtir de la vue "Clientview"
     * appel de la fonction writeToFile de la class "Dao" pour l'ecriture sur le fichier
     */
    public static void createCompte() throws IOException {
        String listCreatedCompte = compteView.createCompteView();
        String fileName = "Files/Compte.csv";

        Dao.writeToFile(fileName, listCreatedCompte);
    }
}
