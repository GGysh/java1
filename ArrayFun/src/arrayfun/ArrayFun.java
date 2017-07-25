/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

/**
 *
 * @author Education Unlmited
 */
public class ArrayFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int [10];
         
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;       
        array1[6] = 13; 
        array1[7] = 15;
        array1[9] = 17;
 
        System.out.println("the element at index" + 0 + "is" + array1[0]);
        System.out.println("the element at index" + 0 + "is" + array1[1]);
        System.out.println("the element at index" + 0 + "is" + array1[2]);
        System.out.println("the element at index" + 0 + "is" + array1[3]);
        System.out.println("the element at index" + 0 + "is" + array1[4]);
        System.out.println("the element at index" + 0 + "is" + array1[5]);
        System.out.println("the element at index" + 0 + "is" + array1[6]);
        System.out.println("the element at index" + 0 + "is" + array1[7]);
        System.out.println("the element at index" + 0 + "is" + array1[8]);
        System.out.println("the element at index" + 0 + "is" + array1[9]);
        System.out.println();
        
        
        double[] array2 = new double[10];
        
        array2[0] = 1.25;
        array2[1] = 2.5;
        array2[2] = 3.75;
        array2[3] = 5;
        array2[4] = 6.25;
        array2[5] = 7.5;
        array2[6] = 8.75;
        array2[7] = 9;
        array2[8] = 10.25;
        array2[9] = 11.5;
        
        
        
        System.out.println("the element at index" + 0 + "is" + array2[0]);
        System.out.println("the element at index" + 0 + "is" + array2[1]);
        System.out.println("the element at index" + 0 + "is" + array2[2]);
        System.out.println("the element at index" + 0 + "is" + array2[3]);
        System.out.println("the element at index" + 0 + "is" + array2[4]);
        System.out.println("the element at index" + 0 + "is" + array2[5]);
        System.out.println("the element at index" + 0 + "is" + array2[6]);
        System.out.println("the element at index" + 0 + "is" + array2[7]);
        System.out.println("the element at index" + 0 + "is" + array2[8]);
        System.out.println("the element at index" + 0 + "is" + array2[9]);
        
        int[] array3 = new int[1000];
        
        int index = 0;
        while (index<1000){
            array3[index] = index;
            System.out.println("the element at index" + index );
            index++;
        }
    }
    
}
