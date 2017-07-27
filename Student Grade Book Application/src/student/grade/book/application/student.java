/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grade.book.application;

import java.util.ArrayList;

/**
 *
 * @author Education Unlmited
 */
class student {
    String name;
    ArrayList<Integer> grades;
    ArrayList<Double> average;
    
    public student (String n) {
        name =n;
        grades = new ArrayList();
        average = new ArrayList();
    }
    
    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int i : grades) {
            System.out.print(i + " ");
        }
        System.out.println("Arrage: "); 
        
        System.out.println();
    }
    
    
}
