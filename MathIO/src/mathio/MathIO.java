/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Education Unlmited
 */
public class MathIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
         
            String line1 = "4\n";
            writer.write(line1);
            String line2 = "4556.67\n";
            writer.write(line2);
            String line3 = "50\n";
            writer.write(line3);
            String line4 = "4\n";
            writer.write(line4);
            String line5 = "666\n";
            writer.write(line5);
            
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double sum = 0;
            
            while (currentLine != null) {
		System.out.println(currentLine);
                sum += Double.parseDouble(currentLine);
                currentLine = reader.readLine();
            }
            
            System.out.println(sum);

	}
        catch (IOException e) {
            e.printStackTrace();
    }
    }
}

