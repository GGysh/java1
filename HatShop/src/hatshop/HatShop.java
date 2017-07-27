/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatshop;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class HatShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("add hats to cart(type a)");
        System.out.println("see ur cart(type s)");
        System.out.println("remove hats from the order(tpye r)");
        System.out.println("check out(type c)");
        String a = ("add a hat to cart");
        String s = ("see ur cart");
        String r = ("remove ur hats form the order");
        String c = ("check out");
        {
            Scanner keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine();
            int hats = 0;
            if (answer.equals("a")) 
                {
                    System.out.println("how many u want");
                    int answer1 = Integer.parseInt(keyboard.nextLine());

                    while (hats < answer1) {
                        hats++;
                    }

                    System.out.println("wanna see how many u have?");
                    String answer2 = keyboard.nextLine();
                    if (answer.contains("yes"));
                    System.out.println(hats);

                    System.out.println("wanna remove some of them?");
                    String answer3 = keyboard.nextLine();
                    if (answer3.contains("yes"));
                    System.out.println("how many u want to remove");
                    int answer4 = Integer.parseInt(keyboard.nextLine());
                    int z = hats - answer4;
                    System.out.println("u have" + z + "left");
                    System.out.println("wanna check out ?");
                }
                    if (answer.contains("s")) {
                    System.out.println("u have" + hats + "in ur cart");
                    System.out.println("add hats(type a)");
                    String answer7 = keyboard.nextLine();
                    if (answer7.equals("a")) {
                    System.out.println("how many u want");
                    int answer8 = Integer.parseInt(keyboard.nextLine());

                    while (hats < answer8) {
                        hats++;
                    }

                    System.out.println("wanna see how many u have?");
                    String answer12= keyboard.nextLine();
                    if (answer12.contains("yes"));{
                    System.out.println(hats);

                    System.out.println("wanna remove some of them?");
                    String answer9 = keyboard.nextLine();
                    if (answer9.contains("yes"));
                    System.out.println("how many u want to remove");
                    int answer10 = Integer.parseInt(keyboard.nextLine());
                    int z = hats - answer10;
                    System.out.println("u have" + z + "left");
                    System.out.println("wanna check out ?");
                    
            
                }
                

            

        }
    }
}
