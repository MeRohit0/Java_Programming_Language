/*
Write a program to find the factorial of any number entered by the user
 */
import java.util.Scanner;

public class _61_loop_question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i = number ; i > 0 ; i--){

            if(number == 0 || number == 1 ){
                factorial *= 1;
            }
            else{
                factorial *= i;
            }
        }
        System.out.println("factorial of the number is : " + factorial);
        sc.close();
    }
}
