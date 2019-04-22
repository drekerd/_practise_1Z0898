package com.example;

import java.io.*;
import java.util.Scanner;

public class FileService {

    //"/home/mariosilva/Documents/Workspace/JavaRumos/Mod4 - JAVA SE8 Programming/Material Oficial/D84838GC10_labs/labs/11-Exceptions/solutions/practice1/CatchingExceptions11-01Soln/src/DeclarationOfIndependence.txt";

    public String exeptionTest(String src){

        String finalString ="";

        try (BufferedReader b = new BufferedReader(new FileReader(src));) {
            String s = null;
            while((s = b.readLine()) != null) {
                finalString = finalString.concat(s).concat("\n");
            }
        } catch(FileNotFoundException e) {
            //System.out.println("File not found:" + src);
            System.exit(1);
            return "File not found:" + src;
        } catch(IOException e) {
            //System.out.println("Error reading file:" + e.getMessage());
            System.exit(1);
            return "Error reading file:" + e.getMessage();
        }

        return finalString;
    }

    public void copyFile(String originalFilePath,String newFilePath){

        File createdFile = new File(newFilePath);
        String reader;


        try (BufferedReader originalFile = new BufferedReader(new FileReader(originalFilePath));
             FileWriter fileWriter = new FileWriter(createdFile);){

            while((reader = originalFile.readLine()) !=null){
                fileWriter.write(reader);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
