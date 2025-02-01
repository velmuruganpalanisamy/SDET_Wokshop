package com.fss;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileOperation {
   
    public static void mian(String arg[])
    {
        try {
            File file = new File();
           // f.createNewFile();

            FileWriter file = new FileWriter(f);
            file.append("This file contains password");
            file.close();

        } catch (Exception e) 
        {
            System.out.println("File not created ");
        }
    }
    
}
