package fr.afpa.bank.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DaoUtils {
    /**
     * method to write some text to the file we already created
     * @param fileName
     * @param textToWrite
     */
    public static void writeToFile(String fileName,String textToWrite) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(textToWrite);
            myWriter.close();
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param fileName
     * @return list of string" all lines from file".
     */
    public static List<String> readFile(String fileName){
        List<String> listAllLineFile=new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                listAllLineFile.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return listAllLineFile;
    }
    public static int generatedCodeAgence(){
        //GeneratedNumber=x*100  +  y*10  + Z
        Random rand=new Random();
        int x=rand.nextInt(9);
        int y=rand.nextInt(9);
        int z=rand.nextInt(9);
        return(x*100 +  y*10  +  z);

    }
}
