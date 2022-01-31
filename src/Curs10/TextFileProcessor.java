package Curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

    /**
     * Writes a new txt file
     */
    public void writeFile(){
        try{

            FileWriter myFileWriter = new FileWriter("filename.txt");
            myFileWriter.write("Textul meu in fisier\n");
            myFileWriter.close();
            System.out.println("Successfully wrote to file!");

        }catch (IOException err){

            System.out.println("An error occured!");
            err.printStackTrace();

        }
    }

    /**
     * reads from txt file
     */
    public void readFile(){
        try {

            File objFile = new File("filename.txt");
            Scanner myReader = new Scanner(objFile);

            while (myReader.hasNextLine()){
                String text = myReader.nextLine();
                System.out.println(text);
            }
            myReader.close();

        }catch (FileNotFoundException err){

            System.out.println("An error occured!");
            err.printStackTrace();

        }
    }

    /**
     * append text to file
     */
    public void appendTextToFile(){
        try {

            FileWriter myWriter = new FileWriter("filename.txt",true);
            myWriter.write("New line \n");
            myWriter.close();

        }catch (IOException err){

            System.out.println("An error occured!");
            err.printStackTrace();

        }

    }

    /**
     * delete file
     */
    public void deleteFile(){
        try {
            File objFile = new File("filename.txt");
            objFile.delete();
            System.out.println("Deleted file : " + objFile.getName());

        } catch (Exception e){
            System.out.println("Could not delete file!");
        }
    }

}
