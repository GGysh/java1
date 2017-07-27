/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choose.yourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Choose Your Own Adventure");
           System.out.println("let start a new life");
           System.out.println("first choice : rich man ");
           System.out.println("second choice : poor beautiful and sexy woman");
           Scanner keyboard = new Scanner(System.in);
           String answer1 = keyboard.nextLine();
        if(answer1.contains("first")){
           System.out.println("now , u are a rich man and u have tons of business to do. And today , one of ur oldschoolmate is going to die");
           System.out.println("first choice : go take a look of him.");
           System.out.println("second choice : keep working");
           String answer2 = keyboard.nextLine();
           if(answer2.contains("first")){
               System.out.println("u buy some flowers , buy some nutrient. the traffic can't take u there , but u have to be there in one hour ");
               System.out.println("first choice : use helicopter");
               System.out.println("second choice : run and walk ");
               String answer3 = keyboard.nextLine();
               if(answer3.contains("first")){
               System.out.println("u catch up , he is about to die . u are happy that he is still alive. but 10 people come in and take u to another room , take away ur phone and lock the door.");
               System.out.println("a really beautiful and sexy woman come in , she introduce herself . she says she is poor and her mother need medication help");
               System.out.println("becuase u look handsome and rich , she find u . then , she take off her clothes.");
               System.out.println("first choice : u say no for sex but yes for money");
               System.out.println("second choice : take off urs and do sex and give her ur money ");
                      String answer4 = keyboard.nextLine();
                      if (answer4.contains("first"));{
                      if (answer4.contains("second"));
                      System.out.println("marry her , story end ");}
               }}else
                   System.out.println("when u arrive he died , u are sad , after u come back from hospital, u go our for dinner. there is a beautiful woamn there who looks really sad ");
                   System.out.println(" first choice : go talk to her");
                   System.out.println(" second choice : keep being lonely and sad alone");
                       String answer5 = keyboard.nextLine();
                       if(answer5.contains("first"));
                       System.out.println("make friend and turn to couple");
                       if(answer5.contains("second"));
                       System.out.println("haven't marries til die");
                       
           
    }else
            System.out.println("now, u are a poor beautiful woman and u have a poor boyfriend , u love him so much and u need money to save ur mom's life");
            System.out.println("first choice : find a new rich boyfriend ");
            System.out.println("second choice : work much harder, earn more money");
            String answer6 = keyboard.nextLine();
            if(answer6.contains("first")){
            System.out.println("first choice : go to tons of free party to show how beautiful u are for a rich boyfriend");
            System.out.println("second choice : go for a board walk ");
            String answer7 = keyboard.nextLine();
                if(answer7.contains ("first")){
                System.out.println("ur dancing , clothing let u look like ab angel");
                System.out.println(" ur beautiful attract boys to talk to u");
                System.out.println(" first choice : find the rich and handsome boy and become his girlfriend");
                System.out.println(" second choice : get money from them by being their girlfriend");
                        String answer8 = keyboard.nextLine();                       
                        if(answer8.contains("first"));
                        System.out.println("save ur mom's life and get a good marriage");
                        if(answer8.contains("second"));
                        System.out.println("save ur mom's life , looking for new marriage");
                }else{
                System.out.println("u are lying on the beach and walk around");
                System.out.println(" ur beautiful attract boys to talk to u");
                System.out.println(" first choice : find the rich and handsome boy and become his girlfriend");
                System.out.println(" second choice : get money from them by being their girlfriend");
                        String answer9 = keyboard.nextLine();                       
                        if(answer9.contains("first"));
                        System.out.println("save ur mom's life and get a good marriage");
                        if(answer9.contains("second"));
                        System.out.println("save ur mom's life , looking for new marriage");
            }}else 
                System.out.println(" ur mom died , u can't earn enough money for medical care");
            
                
                        
                    System.out.print("the end ");
            }
        }
    }  
     
}
