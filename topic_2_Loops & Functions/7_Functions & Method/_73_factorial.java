/*
    program for finding Factorial of number n 
 */

import java.util.Scanner;

public class _73_factorial {
    
    public static int factorial(int n ){
        int f = 1 ; 
        for (int i = 1; i <= n ; i++) {
            f *= i ;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Factorial of n is : "+factorial(number));
        sc.close();
    }
}
