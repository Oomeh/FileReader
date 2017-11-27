/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bvance
 */
public class Reader {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //Fields
        ArrayList<String> lineArray = new ArrayList<>();        
        int i = 0;

        try{
            //Buffers the file for reading and finds the file to read
        BufferedReader in = new BufferedReader((new FileReader("/Volumes/Shared Files/Sample Data Files/BoyNames.txt")));   
        //Reads the first line
        String line = in.readLine();      

            while(line != null)
            {

                //Adds the string to the arraylist
                lineArray.add(line);    
                //Reads the next line
                line = in.readLine(); 
                //Sorts the list aphabetically
                Collections.sort(lineArray);
                i++;                
            }
            
            for(int j = 0; j < i; j++)
            {
                //Prints the items
                System.out.println(lineArray.get(j));
            }
        //Creates the file to be written on
        File file = new File("c:\\writtenfile.txt");

            //Creates the writer
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("c:\\writtenfile.txt")));
            for(int k = 0; k < i; k++)
            {
                //Writes the current line onto the file
                writer.println(lineArray.get(k));
                
            }
            //Closes the writer
            writer.close();
        }
        //If file read/write fails, catches
        catch(IOException e){
            System.out.println("File read/write failed D:");
        }
        

    }
    
}
