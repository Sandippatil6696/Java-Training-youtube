package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingTest {

    /**
     * this is a try catch with resource 
     * you not need to close resurce object if we declare likr this 
     *  try (FileWriter fw = new FileWriter(fileName))
     * @param args
     */
    public static void main(String[] args) {

        String fileName = "Java-course.txt";

        
        try (FileWriter fw = new FileWriter(fileName)){
            
            fw.write("this is a best java course \n");
            fw.write("welcome to the loop \n");
            fw.write("welcome to file writer");
            for (int i = 0; i < 10; i++) {
                fw.write(" * ");
            }
            
            fw.flush();
            System.out.println("file is write successfully");


        } catch (IOException e) {
           System.out.printf("exception occured %s \n" , e.getMessage());
        }
    }

}
