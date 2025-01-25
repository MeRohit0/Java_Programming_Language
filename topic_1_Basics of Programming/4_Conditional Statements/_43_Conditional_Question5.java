/*
    Write a Java program that takes a year from the user 
    and print whether that year is a leap year or not.
 
 ----> see the ( line  16 - 25 )
 
 */

import java.util.Scanner;

public class _43_Conditional_Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        boolean x = year%4 == 0;
        boolean y = year%100 != 0;
        boolean z = year%100 == 0 && year%400 == 0;

        if(x && ( y || z ) ){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }

        //upper code has different approch thats why i comment this 

        
        // if( year%4 != 0 ){
        //     System.out.println(year + " not a leap year");
        // }
        // else{
        //     if (year%100 != 0 ) {
        //         System.out.println(year + " This is a leap year");
        //     } else {
        //         if (year%400 != 0) {
        //             System.out.println(year + " This is not a leap year");
                    
        //         } else {
        //             System.out.println(year + " This is a leap year");
        //         }
                
        //     }
        // }
        sc.close();
    }
}
