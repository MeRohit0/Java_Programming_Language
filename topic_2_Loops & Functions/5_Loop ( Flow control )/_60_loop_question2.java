/*
Write a program that reads a set of integers and then prints the sum of the even and odd integers
 */

import java.util.Scanner;

public class _60_loop_question2 {
public static void main(String args[]){

    // i have use try with resource block to deallocate Scanner when program terminate 
    // we can go without the try block also but this will give warning in vscode 
    
    try (Scanner sc = new Scanner(System.in)) {
        int sum_of_even_number = 0;
        int sum_of_odd_number = 0;
        while(true){
            System.out.print("Input a number (press 0 to exit ):");
            int number = sc.nextInt();
            if(number == 0 ){
                break;
            }else if (number % 2 == 0 ) {
                sum_of_even_number +=number;
            }
            else{
                sum_of_odd_number += number ;
            }
        }
        System.out.println("Sum of even number is : " + sum_of_even_number);
        System.out.println("Sum of odd number is  : " + sum_of_odd_number);
    }

}    
}
