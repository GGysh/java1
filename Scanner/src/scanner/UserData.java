/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class UserData {

    /**
     * @param args the command line arguments
     */ public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        System.out.println("HI, " + name +", how old are u?");
        int a = Integer.parseInt(keyboard.nextLine());
        System.out.println("alright , HAHA , man we have same age");
        System.out.println("Which is your birthday day?");
        String day = keyboard.nextLine();
        System.out.println("Which is your birthday month?");
        String month = keyboard.nextLine();
        System.out.println("You were born in which year?");
        String year = keyboard.nextLine();
        System.out.println(year + day + month );
        System.out.println("what is ur favorite book?");
        String book = keyboard.nextLine();
        System.out.println("NC , You know what , i love 1984");
        System.out.println("what about your hometown , where it is?");
        String hometown = keyboard.nextLine();
        System.out.println("alright,alright my hometown is GZ, HAHA , "
                + "any lucky numbers ");
        int b = Integer.parseInt(keyboard.nextLine());
        System.out.println("what about shoes size?");
        double d = Double.parseDouble(keyboard.nextLine());
        System.out.println("How excited you are to learn java?(1 to 5)");
        double e = Double.parseDouble(keyboard.nextLine());
        System.out.println("one fact about you");
        String fact = keyboard.nextLine();
        System.out.println(name,"age" a , day + month + year, "favorite book is"book, c, b, d, e, fact");
        
        
                
        
        
        
    }
      
    
}
