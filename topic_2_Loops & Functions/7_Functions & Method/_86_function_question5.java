/*

Write a Java method to compute the sum of the digits in an integer

*/

import java.util.Scanner;

public class _86_function_question5 {

    public static  int digisum(int number ){
        int i = 0 ;
        while(number > 0 ){
            i = i + (number % 10 ) ;
            number /= 10 ;  
        }
        return i;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System. in ); 
        System.out.print("Enter a number :");
        int number = sc . nextInt();

        int sum = digisum(number);
        System.out.println(sum);

        sc.close();
    }
}
