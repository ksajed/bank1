package fr.afpa.bank.dao;

import fr.afpa.bank.controllers.AgenceController;
import fr.afpa.bank.views.AgenceView;
import fr.afpa.bank.views.ClientView;
import fr.afpa.bank.views.ViewUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AgenceDao {
    static Scanner scanner=new Scanner(System.in);

    public static void showAll(){
        List<String> list = Dao.readFile("Files/Agence.csv");
        System.out.println(list.get(0));
        System.out.println("*************************************************");
        for (int i = 1;  i< list.size(); i++) {
            System.out.println(i+". "+list.get(i));

        }
    }
//code,nom, adressePostale, codePostal, ville
    public static void updateName() throws IOException {
        AgenceView.showAllAgency();

        String fileName = "Files/Agence.csv";

        System.out.println("Entrer Id agence: ");
        String idAgence=scanner.nextLine();

        System.out.println("Entre votre nouveau nom d'agence:");
        String newValueNom= scanner.nextLine();

        List<String> listAgence = Dao.readFile("Files/Agence.csv");
        String agenceFinded=null;

        for (String agence: listAgence) {
             String[] values=agence.split(";");
                   if(values[0].equals(idAgence)) {
                            agenceFinded=agence ;   //tab to string ;
                   }
        }
        //
        listAgence.remove(agenceFinded);
        String[] stringAgence=agenceFinded.split(";");

        //modifier l'agence
        stringAgence[1]=newValueNom;
        String medifiedAgence=toCSV(stringAgence);
        listAgence.add(medifiedAgence);

        System.out.println("Agence finded"+agenceFinded);
        System.out.println("ma nouvelle list "+listAgence);

        Dao.writeToFileNotAppend(fileName, listAgence.get(0));
        //writeToFile(String fileName,String textToWrite)
        for (int i=1;i< listAgence.size();i++) {
            if(listAgence.get(i)!=""){
                Dao.writeToFile(fileName, listAgence.get(i));
            }
        }

    }

    public static String toCSV(String[] array) {
        String result = "";

        if (array.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (String s : array) {
                sb.append(s).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return result;
    }
    //code,nom, adressePostale, codePostal, ville
    public static void updateAdress() throws IOException {
        AgenceView.showAllAgency();

        String fileName = "Files/Agence.csv";

        System.out.println("Entrer Id agence: ");
        String idAgence=scanner.nextLine().trim();

        System.out.println("Entre votre la nouvelle adresse de l'agence:");
        String newValueAdress= scanner.nextLine().trim();

        List<String> listAgence = Dao.readFile(fileName);
        String agenceFinded=null;
        String[] values=null;
        List<String> listAgenceLine=new ArrayList<>();

               for (String agence:listAgence) {
                        values=agence.split(",");
                         listAgenceLine= Arrays.asList(values);
                         if(listAgenceLine.get(0).equals(idAgence)) agenceFinded=agence;
               }

        System.out.println("agence finded "+agenceFinded);
        String[] stringAgence=null;
        if(agenceFinded!=null) {
                     listAgence.remove(agenceFinded);
                     stringAgence = agenceFinded.split(",");
             }else System.out.println("Agence file not found!!");


        //modifier l'agence
        stringAgence[2]=newValueAdress;
        String medifiedAgence=toCSV(stringAgence);
        listAgence.add(medifiedAgence);
        System.out.println(listAgence);


        Dao.writeToFileNotAppend(fileName, listAgence.get(0));
        //writeToFile(String fileName,String textToWrite)
        for (int i=1;i< listAgence.size();i++) {
            if(listAgence.get(i)!=""){
                Dao.writeToFile(fileName, listAgence.get(i));
            }
    }
}
}
