package fr.afpa.bank.views;

import fr.afpa.bank.controllers.AgenceController;
import fr.afpa.bank.controllers.ClientController;
import fr.afpa.bank.controllers.CompteController;
import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.CompteDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.dao.DaoClient;

import java.io.IOException;
import java.util.Scanner;

public class ViewUtils {
    static Scanner scanner=new Scanner(System.in);
    static  String choix;

    public static String afficherMenuPrincipal() {

        menuTxt();
        return yourChoice();
    }

    public static String yourChoice(){
        System.out.print("\tChoix   ");
        choix = scanner.nextLine();
        return choix;
    }

    /**
     * Menu principal avec le switch
     */
    public static void mainMenuSwitch() throws IOException {

        int choiceentry;

        do {
            choiceentry = Integer.parseInt(afficherMenuPrincipal());
            switch (choiceentry)
            {
                case 1:
                    AgenceController.createAgence();

                    break;
                case 2:
                    ClientController.createClient();

                    break;
                case 3:
                   CompteController.createCompte();

                    break;
                case 4:
                    System.out.println("Num de compte :");
                    System.out.println( CompteDao.searchAccountByAccountNumber(scanner.nextLine()));

                    break;
                case 5:
                    ClientView.searchClientByCriteria();

                    break;
                case 6:
                    ClientView.searchClientByNumCompte();

                    break;
                case 7://Imprimer les infos client (identifiant client)
                    System.out.println("Entrer le Client id(Afficher les infos client) :");

                    ClientView.showClientByeIdClient(scanner.nextLine());

                    break;
                case 8: //8 -	Afficher tous les agences");
                    AgenceView.showAllAgency();

                    break;
                case 9://Afficher tous les clients"
                    ClientView.showAllClient();

                    break;
                case 10://Afficher tous les comptes bancaires
                    CompteView.showAllCompte();

                    break;

                case 11://supprimer agence
                    String idAgence=AgenceView.removeAgence();
                    AgenceController.removeAgence(idAgence);

                    break;
                case 12:
                     AgenceView.updateAgence();


                case 17: //affiche menue principal
                    afficherMenuPrincipal();

                    break;
                case 20://quitter

                    System.out.println("bye...");
                    break;


                default:
                    System.out.println("Choice must be a value between 1 and 14.");
            }

        } while (choiceentry != 13);


    }



    private static void menuTxt() {
        System.out.println(
                "------------------------------- MENU BANQUE CDA ------------------------------------------------");
        System.out.println("1 -	Creer une agence ");
        System.out.println("2 -	Creer un client ");
        System.out.println("3 -	Creer un compte bancaire ");
        System.out.println("4 -	Recherche de compte (numero de compte) ");
        System.out.println("5 -	Recherche de client (Nom, Numero de compte, identifiant de client)");
        System.out.println("6 -	Afficher la liste des comptes d'un client (identifiant client)");
        System.out.println("7 -	Imprimer les infos client (identifiant client)");
        System.out.println("8 -	Afficher tous les agences");
        System.out.println("9 -	Afficher tous les clients");
        System.out.println("10-	Afficher tous les comptes bancaires");
        System.out.println("11-	Supprimer agence");
        System.out.println("12-	Update agence");
        System.out.println("17-	Retour au menu ");
        System.out.println("20-	Quitter le programme ");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------");
    }
}
