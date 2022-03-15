package fr.afpa.bank.views;

import fr.afpa.bank.controllers.AgenceController;
import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.Dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgenceView {
    static Scanner scanner = new Scanner(System.in);

    public static String createAgenceView() {
        List<String> list = new ArrayList<>();
        String stringFormatToAllAttributesAgence = String.valueOf( Dao.generatedCodeAgence()) + ";";

        System.out.println("Enter le nom de l'agence:");
        stringFormatToAllAttributesAgence =  stringFormatToAllAttributesAgence+scanner.nextLine() + ";";


        System.out.println("Entrer l'adresse:");
        stringFormatToAllAttributesAgence = stringFormatToAllAttributesAgence + scanner.nextLine() + ";";

        System.out.println("Entrer le code postal:");
        stringFormatToAllAttributesAgence = stringFormatToAllAttributesAgence + scanner.nextLine() + ";";


        System.out.println("Entrer la ville:");
        stringFormatToAllAttributesAgence = stringFormatToAllAttributesAgence + scanner.nextLine();
        return stringFormatToAllAttributesAgence;


    }

    public static void showAllAgency() {
        List<String> listAgence = Dao.readFile("Files/Agence.csv");
                    for (String agence: listAgence) {
                           System.out.println("» "+agence);
                    }

    }

    public static String removeAgence() {
        showAllAgency();
        System.out.println("->Code agence to supprimer:");
        return scanner.nextLine();
    }

    //code,nom,adresspostale,codeposta,ville
    public static void updateAgence() throws IOException {
        System.out.println(
                "------------------------------- MENU UPDATE AGENCE------------------------------------------------");

        System.out.println(" N  -nom          Update ");
        System.out.println(" A  -adresse      Update ");
        System.out.println(" CP -codePostal   Update ");
        System.out.println(" V  -Ville        Update ");

        String  update_choice;

        do {
            System.out.println("choice to update:");
            update_choice = scanner.nextLine();

            switch (update_choice) {
                case "N"://update nom
                    AgenceDao.updateName();
                    break;
                case "A"://update adresse
                    break;
                case "CP"://update adresse
                    break;
                case "V"://update adresse
                    break;
                case "Q"://update adresse
                    break;

            }
        }while (update_choice == "Q" || update_choice == "q") ;



    }
}

