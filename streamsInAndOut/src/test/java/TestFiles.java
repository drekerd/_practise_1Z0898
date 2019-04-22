import com.example.FileService;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class TestFiles {


    @Test
    public void checkFileContentFileExist(){
        FileService serviceClass = new FileService();

        final String FLE_CONTENT = serviceClass.exeptionTest("/home/mariosilva/Documents/Workspace/JavaRumos/Mod4 - JAVA SE8 Programming/Material Oficial/D84838GC10_labs/labs/11-Exceptions/solutions/practice1/CatchingExceptions11-01Soln/src/DeclarationOfIndependence.txt");

        Assert.assertTrue(FLE_CONTENT.contains("in the course of human events"));
    }

    @Test
    public void checkFileContentDoesNotFileExist(){
        FileService serviceClass = new FileService();

        String fileContent = serviceClass.exeptionTest("/home/cenas");

        System.out.println(fileContent+"CEASCASC");
        //Assert.assertTrue(FLE_CONTENT.contains("File Not Found"));
    }

    @Test
    public void imputStreamCenas(){

        FileService serviceClass = new FileService();

        String fileContent = serviceClass.exeptionTest("/home/mariosilva/Documents/Workspace/JavaRumos/Mod4 - JAVA SE8 Programming/Material Oficial/D84838GC10_labs/labs/11-Exceptions/solutions/practice1/CatchingExceptions11-01Soln/src/DeclarationOfIndependence.txt");

        File file = new File("/home/mariosilva/Documents/Workspace/JavaRumos/Mod4 - JAVA SE8 Programming/Material Oficial/D84838GC10_labs/labs/11-Exceptions/solutions/practice1/CatchingExceptions11-01Soln/src/CopyDeclarationOfIndependence.txt");

        //Create the file
        try {
            if (file.createNewFile())
            {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Write Content
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

                writer.write(fileContent);


        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void TestCopy(){

        String originalFilePath = "/home/mariosilva/IdeaProjects/_1z0898/streamsInAndOut/src/OriginalFile.txt";
        String copyFilePath = "/home/mariosilva/IdeaProjects/_1z0898/streamsInAndOut/src/CenasCopy.txt";
        String file1Firstline = null;
        String file2Firstline = null;
        File checkifFileExist = new File (copyFilePath);

        if(checkifFileExist.exists()){
            checkifFileExist.delete();
        }

        FileService copyToFile = new FileService();
        copyToFile.copyFile(originalFilePath,copyFilePath);

        try (BufferedReader originalFile = new BufferedReader(new FileReader(originalFilePath));
             BufferedReader copiedFile = new BufferedReader(new FileReader(copyFilePath))){

            file1Firstline = originalFile.readLine();
            file2Firstline = copiedFile.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Assert.assertEquals(file1Firstline,file2Firstline);
        System.out.println(file1Firstline + " and " + file2Firstline);


    }

}
