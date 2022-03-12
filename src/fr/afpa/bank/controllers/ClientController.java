package fr.afpa.bank.controllers;

import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.views.AgenceView;
import fr.afpa.bank.views.ClientView;

import java.io.IOException;

public class ClientController {

    AgenceDao agenceDao = new AgenceDao();
    static ClientView clientView = new ClientView();

    /**
     * recuperer les informations de client a creer aprtir de la vue "Clientview"
     * appel de la fonction writeToFile de la class "Dao" pour l'ecriture sur le fichier
     */
    public static void createClient() throws IOException {
        String listCreatedClient = clientView.createClientView();
        System.out.println(listCreatedClient );
        String fileName = "Files/Client.csv";

        Dao.writeToFile(fileName, listCreatedClient);
    }
}