/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        BufferedReader in = new BufferedReader((new FileReader("/Users/bvance/Documents/BoyNames.txt")));   
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
            
        }
        //If fileread fails, catches
        catch(IOException e){
            System.out.println("File read failed D:");
        }
    }
    
}
