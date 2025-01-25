/*
using while loop print the number from 1 to n 
 */

import java.util.Scanner;
public class _47_print_no_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter number the value of n : " );
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range ){
            System.out.println( counter +" ");
            counter++;
        }
        
        sc.close();
    }
}
