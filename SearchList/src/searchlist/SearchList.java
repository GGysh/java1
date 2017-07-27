/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(50);
        al.add(5);
        al.add(6);
        al.add(19);
        al.add(15);
        al.add(8);
        al.add(10);
        al.add(42);
        al.add(38);
        al.add(29);
        System.out.println("guess any number between 0 and 50 ");
        Scanner keyboard = new Scanner(System.in);
        int answer1 = Integer.parseInt(keyboard.nextLine());
        if (al.contains(answer1)) {
            System.out.println(" found ");
        } else {
            System.out.println("not found");
        }
        int mN = 0;
        for (int a : al) {

            if (a > mN) {
                mN = a;
            }

        }

       System.out.println(mN);
       
       ArrayList s = new ArrayList();
       s.add("A"); s.add("bunch"); s.add("of"); s.add("revolutionary"); s.add("manumission"); s.add("abolitionists"); 
       s.add("give me "); s.add("your position"); s.add("show me"); s.add("where"); s.add("the"); s.add("ammunition"); s.add("is!");
       System.out.println(s);
       
       
       
       
    }   
               
               
               
               
        
         
}
