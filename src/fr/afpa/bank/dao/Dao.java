package fr.afpa.bank.dao;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dao {
    static Random random=new Random();
    /**
     * append csv file
     * @param fileName
     * @param textToWrite
     */
    public static void writeToFile(String fileName,String textToWrite) throws IOException {
        Path p = Paths.get(fileName);
        String s =System.lineSeparator()+textToWrite;//write line separator first

        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardOpenOption.APPEND)) {
            writer.write(s);
        } catch (IOException ioe) {
            System.err.format("IOException: %s%n", ioe);
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

    public static String generatedCodeClien(){
        return (generatedUpperCaseLetter() + generatedDigitSix());

    }

    private static String generatedDigitSix() {
        String a = Integer.toString(random.nextInt(9));
        for (int i = 0; i < 5; i++) {
            a = a + Integer.toString(random.nextInt(9));
        }

        return a;
    }

    private static String generatedUpperCaseLetter() {
        char randomUpperLetterFirst = (char) (ThreadLocalRandom.current().nextInt(65, 90));
        char randomUpperLetterSecond = (char) (ThreadLocalRandom.current().nextInt(65, 90));
        String randomUpperCaseString = Character.toString(randomUpperLetterFirst)
                + Character.toString(randomUpperLetterSecond);

        return randomUpperCaseString;
    }
}
