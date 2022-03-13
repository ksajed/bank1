package fr.afpa.bank.views;

import fr.afpa.bank.dao.CompteDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.dao.DaoClient;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientView {
    static Scanner scanner = new Scanner(System.in);


    public static void showClientByeIdClient(String idClient) throws IOException {
        List<String> listClient = DaoClient.searchClientById(idClient);
        String[] values=listClient.get(0).split(";");



        System.out.format("%10s%15s%16s%27s%16s", "ID", "Nom", "Prenom","Date de naissance","Email");
        System.out.println("");
        System.out.format("%10s%15s%16s%27s%16s", values[0], values[1], values[2],values[3],values[4]);



    }

    /**
     * formulaire de saisie client
     *
     * @return
     */
    public String createClientView() {

        List<String> list = new ArrayList<>();
        String clientAttributes = Dao.generatedCodeClien() + ";";
        System.out.println("Enter le nom du client:");
        clientAttributes = clientAttributes + scanner.nextLine() + ";";

        System.out.println("Enter le prenom :");
        clientAttributes += scanner.nextLine() + ";";

        System.out.println("Date de naissance:");
        clientAttributes += scanner.nextLine() + ";";

        System.out.println("Email");
        clientAttributes += scanner.nextLine() + ";";

        return clientAttributes;
    }


    public static void searchClientByCriteria() {


            System.out.println("Menu recherche client par:");
            System.out.println("Nom -> tapper 1");
            System.out.println("Identifiant de client -> tapper 2");
            System.out.println("Numéro de compte -> tapper 3");
            System.out.println("pour Quitter  -> tapper 4");
            System.out.println("choice:");
        int id_choice;
        do {
            System.out.println("Votre choix:");
            id_choice = scanner.nextInt();
            switch (id_choice) {
                case 1:

                    System.out.println("Nom(Recherche client par Nom) :");
                    String str = scanner.next();
                    System.out.println(str);


                    List<String> myListClient = DaoClient.searchClientByName(str);
                    DaoClient.showListClient(myListClient);
                    break;
                case 2:
                    System.out.println("Id client(Recherche client par Id) : ");
                    String strId = scanner.next();
                    List<String> myListClientById = DaoClient.searchClientById(strId);
                    DaoClient.showListClient(myListClientById);
                    break;
                case 3:
                    searchClientByNumCompte() ;
                    break;
                default:
                    System.out.println("Retour Menu Principal.......");
            }
        } while (id_choice != 4);
    }

    public static void searchClientByNumCompte() {
        System.out.println("Numero Compte client(Recherche client par Num compte) : ");
        String strNumCompte = scanner.next();
        List<String> myListIdClient = CompteDao.searchClientById(strNumCompte);
        if(myListIdClient !=null){
      List<String> myListClientById2 = DaoClient.searchClientById(myListIdClient.get(0));
      DaoClient.showListClient(myListClientById2);}
        else System.out.println("Sorry...no customer finded.");
    }


}