/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.grade.book.application;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlmited
 */
public class StudentGradeBookApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students do you want?");
        int c = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.println("what is the name of the student?");
            String name = keyboard.nextLine();
            student s = new student(name);
            System.out.println("Type grades, then type Quit when done");
            String g = keyboard.nextLine();
            while (!g.equals("Quit")) {
                int grade = Integer.parseInt(g);
                s.grades.add(grade);
                g = keyboard.nextLine();
            }
            students.add(s);
        }
        
        for (student s : students) {
            s.printStudent();
        }

       
    }

}
