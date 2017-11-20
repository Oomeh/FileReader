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

/**
 *
 * @author bvance
 */
public class Reader {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        ArrayList<String> lineArray = new ArrayList<>();        
                int i = 0;



       
        try{
        BufferedReader in = new BufferedReader((new FileReader("/Users/bvance/Documents/BoyNames.txt")));   
        String line = in.readLine();      

            while(line != null)
            {


                lineArray.add(line);    
                line = in.readLine();  
                System.out.println(lineArray.get(i));
                i++;                
            }

            
        }
        catch(IOException e){
            System.out.println("File read failed D:");
        }
    }
    
}
