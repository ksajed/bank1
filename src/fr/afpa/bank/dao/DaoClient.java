package fr.afpa.bank.dao;

import java.util.ArrayList;
import java.util.List;

public class DaoClient {

    public static void showAll(){
        List<String> list = Dao.readFile("Files/Client.csv");
        System.out.println(list.get(0));
        System.out.println("*************************************");
               for (int i = 1;  i< list.size(); i++) {
            System.out.println(i+". "+list.get(i));

        }
    }

    public static void showListClient(List<String> list){
        if(list==null) System.out.println("list null");
        else{
        for (int i = 0;  i< list.size(); i++) {
            System.out.println("» "+list.get(i));

        }
    }}

    //Recherche de client (Nom)"
    public static List<String> searchClientByName(String nom){
        List<String> listClientFinded=new ArrayList<>();

        List<String> listClient = Dao.readFile("Files/Client.csv");
        String thisName=null;

        for (String compte: listClient) {
            String[] values=compte.split(";");
            if(values[1].compareTo(nom.trim())==0) listClientFinded.add(compte);
        }
        return listClientFinded;


    }
    //Recherche de client (Id)"
    public static List<String> searchClientById(String id){
        List<String> listClientFinded=new ArrayList<>();

        List<String> listClient = Dao.readFile("Files/Client.csv");

        for (String compte: listClient) {
            String[] values=compte.split(";");
            if(values[0].compareTo(id.trim())==0) listClientFinded.add(compte);
        }
        return listClientFinded;


    }

}
