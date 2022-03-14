package fr.afpa.bank.views;

import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.CompteDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.dao.DaoClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompteView {
    Scanner scanner=new Scanner(System.in);

    public static void showAllCompte() {
        List<String> listCompte= Dao.readFile("Files/Compte.csv");
                for (String compte: listCompte) {
                    System.out.println("» "+compte);
                }
    }

    /**
     * formulaire de saisie Compte
     * @return
     */
    public  String createCompteView(){


        List<String> list=new ArrayList<>();
        String  clientAttributes= Dao.generatedCodeCompte()+";";
        System.out.println("Enter le solde de compte:");
        clientAttributes = clientAttributes+scanner.nextLine()+";";

        System.out.println("decouvertAutorise?(O,o to yes /N,n to Non):");
        clientAttributes += scanner.nextLine()+";";

        System.out.println("typeCompte:");
        System.out.println("pTYPE_COMPTE_COURANT = \"CC\";\n" +
                "    TYPE_LIVRET_A = \"LA\";\n" +
                "     TYPE_PLAN_EPARGNE = \"PEL\";");
        clientAttributes += scanner.nextLine()+";";

        System.out.println("Veuillez choisir un Id agence de la liste :");
        AgenceDao.showAll();
        clientAttributes += scanner.nextLine()+";";

        System.out.println("Veuillez choisir un Id Client de la liste :");
        DaoClient.showAll();
        String idClient=scanner.nextLine();
        List<String> listCompte = CompteDao.searchClientById(idClient);
        System.out.println("nb compte :"+listCompte.size());
        if(listCompte.size()<3)    clientAttributes += idClient+";";
        else {
            clientAttributes=null;
                   }

        return clientAttributes;
    }
}
