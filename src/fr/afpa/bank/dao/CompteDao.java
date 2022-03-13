package fr.afpa.bank.dao;

import java.util.ArrayList;
import java.util.List;

public class CompteDao {


    //Recherche de compte (numero de compte)
    public static String searchAccountByAccountNumber(String accountNumber){
        String returnedCompte=null;

        List<String> listAccount = Dao.readFile("Files/Compte.csv");
        for (String compte: listAccount ) {
            String[] values=compte.split(";");
            if(values[0].compareTo(accountNumber.trim())==0) returnedCompte=compte;

        }
        return returnedCompte;
    }

//retour la liste des id client
    public static List<String> searchClientById(String strNumCompte) {

            List<String> listIdClientfinded=new ArrayList<>();

            List<String> listCompte = Dao.readFile("Files/Compte.csv");

            for (String compte: listCompte) {
                String[] values=compte.split(";");
                if(values[0].compareTo(strNumCompte.trim())==0) listIdClientfinded.add(values[5]);
            }
            return listIdClientfinded;


        }
    }

