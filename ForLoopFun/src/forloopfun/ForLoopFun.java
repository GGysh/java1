/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopfun;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class ForLoopFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       for (int i = 0; i < 10;i++){
       System.out.println("i love java");
       
    }
       System.out.println("choooooose a number");
       Scanner keyboard = new Scanner(System.in);
       System.out.println("what do u wanna start with");
        int answer1 = Integer.parseInt(keyboard.nextLine()); 
        System.out.println("what do u wanna end");
        int answer2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("how much u wanna count by");
          int answer3 = Integer.parseInt(keyboard.nextLine());
       
       for (int i = answer1 ; i < answer2; i+= answer3 ){
         
        
        System.out.println(i);
       }
       double total = 0;
       
       //int index
       
       int[] array1 = new int [10];
       
       for (int i = 0 ; i < 10; i++ ){
            array1[i]= i+1 ;
           
       
       }
       
        int[] array2 = new int [10];
       
       for (int i = 0 ; i < 10; i++ ){
            array2[i]= array1[i]+2;
           System.out.println(array2[i]);
       
       }
       
       int[] array3 = new int [100];
       
       for ()
       
    }
}