package fr.afpa.bank.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgenceView {
   static Scanner scanner=new Scanner(System.in);

    public static List<String> createAgenceView(){
        List<String> list=new ArrayList<>();
        System.out.println("Enter le nom de l'agence:");
        list.add(scanner.nextLine());

        System.out.println("Entrer l'adresse:");
        list.add(scanner.nextLine());

        System.out.println("Entrer le code postal:");
        list.add(scanner.nextLine());

        System.out.println("Entrer la ville:");
        list.add(scanner.nextLine());
        return list;




    }
}
