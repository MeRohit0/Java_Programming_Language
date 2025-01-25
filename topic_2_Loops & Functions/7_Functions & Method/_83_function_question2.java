/*
    Write a method named isEven that accepts an int argument.
    The method should return true if the argument is even, 
    or false otherwise. Also write a program to test your method
*/

import java.util.Scanner;

public class _83_function_question2 {
    public static boolean isEven(int a ){
        if( a%2 == 0 ){
            return true ; 
        }else {
            return false ;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); 
        int number = 1;
        while(number != 0  ){
            System.out.print("Enter a number (exit press 0 )");
            number = sc.nextInt();
            if(number == 0 )break ;
            else if (isEven(number) == true){
                System.out.println("Even Number ");
            }else{
                System.out.println("Odd Number ");
            }
        }
        sc.close();
    }
}
