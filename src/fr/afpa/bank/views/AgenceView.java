package fr.afpa.bank.views;

import fr.afpa.bank.dao.Dao;

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

    }

