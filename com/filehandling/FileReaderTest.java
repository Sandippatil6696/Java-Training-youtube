package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {
         /**
          * file reader reads value in integer until it returns -1 

          */

        String fileName ="Java-course.txt";
        int r = 0;
        
        try (FileReader reader = new FileReader(fileName)) {

            do {
                r = reader.read();
                System.out.print((char)r); // converting r int to String 
            } while (r != -1);

            // while ((r = reader.read()) != -1) {
            //     System.out.print((char)r);
            // }

        }
        catch (FileNotFoundException exception) {
                System.out.printf("file not found occured %s ", exception.getMessage());
            }

        catch (IOException e) {
            System.out.printf("error occured %s ", e.getMessage());
        }
    }

}
