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
    ArrayList<Double> assignment;
    
    public student (String n) {
        name =n;
        grades = new ArrayList();
        average = new ArrayList();
        assignment = new ArrayList();
    }
    
    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int i : grades) {
            System.out.print(i + " ");
        }
        System.out.println("\nAssignments: ");
        for (double i : assignment){
            System.out.print(i + " ");
        }
        System.out.println("\nGrades Average: "); 
        System.out.println(getGradesAverage());
         System.out.println("Assignment Average: "); 
        System.out.println(getAssignmentAverage());
        System.out.println("Total Average: "); 
        System.out.println(getTotalAverage());
       
        
        
    }
    
    
    public double getGradesAverage() {
        double avg=0;
        for ( int i : grades) {
            avg+=i;
        }
        avg=avg/grades.size();
        return avg;
       
    }
    
     public double getAssignmentAverage() {
        double avg=0;
        for ( double i : assignment) {
            avg+=i;
        }
        avg=avg/assignment.size();
        return avg;
       
    }
     
      public double getTotalAverage() {
        double avg=0;
        for ( int i : grades) {
            avg+=i;
        }for ( double i :assignment) {
            avg+=i;
        }
        avg=avg/(grades.size()+assignment.size());
        return avg;
       
    }
    
    
    
}
