/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;

import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class Repeater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type something: ");
        String input = keyboard.nextLine();

        System.out.println("Here we go!");
        System.out.println("before that , how many times you wanna repeat ?");
        int a = Integer.parseInt(keyboard.nextLine());
        int count = 0;
        while (count < a) {
            System.out.println(input);
            count++;
        }
            int d = (int) (Math.random() * 10) + 1;
            System.out.println("i will roll a dice betweem 1 to 6 , go guess it");
            int guess = Integer.parseInt(keyboard.nextLine());
            System.out.println(guess);
            if (guess == d) {
                System.out.println("nice job man , congradulation ");
            } else {
                System.out.println("lol,u suck at this");
            }

        
    }
}
