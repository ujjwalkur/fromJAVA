package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class I_O_show_file {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        
        //Conform that file has been satisfied
        if (args.length != 1){
            System.out.println("Usages ; Show the file name");
            return;
        }

        //Attempts to open file
        try {
            fin = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException e){
            System.out.println("File not open !");
            
        }
        
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i );
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        // close the file
        try{
            fin.close();
        }catch (IOException e){
            System.out.println("Error closing file");
        }
    }
}
