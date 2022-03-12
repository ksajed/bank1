package fr.afpa.bank.views;

import fr.afpa.bank.dao.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientView {
     Scanner scanner=new Scanner(System.in);

    /**
     * formulaire de saisie client
     * @return
     */
    public  String createClientView(){

        List<String> list=new ArrayList<>();
        String  clientAttributes= Dao.generatedCodeClien()+";";
        System.out.println("Enter le nom du client:");
        clientAttributes = clientAttributes+scanner.nextLine()+";";

        System.out.println("Enter le prenom :");
        clientAttributes += scanner.nextLine()+";";

        System.out.println("Date de naissance:");
        clientAttributes += scanner.nextLine()+";";

        System.out.println("Email");
        clientAttributes += scanner.nextLine()+";";

        return clientAttributes;
    }
}
