package fr.afpa.bank.dao;

import fr.afpa.bank.views.AgenceView;

import java.util.List;

public class AgenceDao {

    public static void showAll(){
        List<String> list = Dao.readFile("Files/Agence.csv");
        System.out.println(list.get(0));
        System.out.println("*************************************************");
        for (int i = 1;  i< list.size(); i++) {
            System.out.println(i+". "+list.get(i));

        }
    }
}
