package fr.afpa.bank.dao;

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

}
