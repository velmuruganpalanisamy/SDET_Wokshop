package com.fss;

import java.io.File;
import java.io.FileWriter;

public class fileOperation {
   
    public static void main(String[] args) {
        try {
            // Specify the file name and path
            File file = new File("example.txt");  // Create a file called example.txt
            
            // If the file does not exist, create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // Create a FileWriter to write to the file
            FileWriter writer = new FileWriter(file);
            writer.append("This file contains password");
            writer.close();  // Close the file after writing

            System.out.println("File created and data written successfully.");
        } catch (Exception e) {
            System.out.println("File not created: " + e.getMessage());
        }
    }
}

