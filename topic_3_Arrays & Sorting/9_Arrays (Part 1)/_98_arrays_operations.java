/*

    it is used to saved multiple values in same list 

    operation on array 
    🔘1. input 
    🔘2. output 
    🔘3. update 

*/

import java.util.Scanner;

public class _98_arrays_operations {
    public static void main(String args[]){
        
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("length of arr is : " + marks.length);

        // int phy ;
        // phy = sc.nextInt();
        System.out.println("Enter marks of physics , chemistry and maths ");
        marks[0] = sc.nextInt();    //phy

        marks[1] = sc.nextInt();    //chem

        marks[2] = sc.nextInt();    //math

        System.out.println("Marks of phy : " +  marks[0]);
        System.out.println("Marks of chem : " + marks[1]);
        System.out.println("Marks of math : " + marks[2]);

        sc.close();
        
        marks[2] = marks[2] + 1 ;  // update the value 
        System.out.println("Updated Marks of Maths : " + marks[2]);

    }
    
}