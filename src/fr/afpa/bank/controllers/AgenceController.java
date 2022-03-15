package fr.afpa.bank.controllers;

import fr.afpa.bank.dao.AgenceDao;
import fr.afpa.bank.dao.Dao;
import fr.afpa.bank.dto.Agence;
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

    //retourne l'index de enregistrement agence via id_agence dans le fichier Agence.csv
    //Code agence;nom de l'agence;l'adresse;code postal
    private static String indexAgenceInFile(String idAgence){
        String findedAgence=null;
        List<String> listAgence = Dao.readFile("Files/Agence.csv");
                      for (String agence:listAgence) {
                             String[] values=agence.split(";");
                                 if(values[0].compareTo(idAgence.trim())==0)  findedAgence= agence;
                       }


        return findedAgence;
    }

    public static void removeAgence(String idAgence) throws IOException {
        String fileName = "Files/Agence.csv";
        String  agence=indexAgenceInFile(idAgence);
        List<String> listAgence = Dao.readFile(fileName);

        System.out.println("index a supp:"+agence);
        boolean removedAgence = (listAgence.remove(agence));
        if(removedAgence)
        System.out.println("["+removedAgence+"]"+ "Successfully deleted");
        else System.out.println("not deleted............");
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

