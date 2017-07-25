/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;}
        else{
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        System.out.println("Here comes the second IQ question");
        
        System.out.println("question 2 : what is 1 + 1 ?");
        System.out.println("\tA) 2");
        System.out.println("\tB) 4");
        System.out.println("\tC) 11");
        System.out.println("\tD) 1111");
        String answer2 = keyboard.nextLine();
        System.out.println("haha, trick, noun of them are right");
        System.out.println("Your score is " + rightAnswers + " out of 2 question.");
        
        
        System.out.println("Here is one , What is 2*2 ?");
        
        if (answer2.equals("4"));{
           System.out.println("CCCCCCCOOOOOOOORECT!");
           rightAnswers++;}     
        else {
           System.out.println("nope");}
    
    
}}
