package fr.afpa.bank.controllers;

import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.views.AgenceView;

import java.io.IOException;
import java.util.List;

public class AgenceController {
    AgenceDao agenceDao=new AgenceDao();
    AgenceView agenceView=new AgenceView();

    /**
     *recuperer les informations de l'agence a creer aprtir de la vue "Agenceview"
     * appel de la fonction writeToFile de la class "Dao" pour l'ecriture sur le fichier
     */
    public static void createAgence() throws IOException {
        String listCreatedAgence = AgenceView.createAgenceView();
        String fileName="Files/Agence.csv";

        Dao.writeToFile(fileName,listCreatedAgence);
    }


}
