/*
    Write a Java method to compute the averageof three numbers.
 */
import java.util.Scanner;

public class _82_function_question1 {

    public static int avgofthree(int a ,int b, int c){
        int sum = a + b + c ;
        sum /= 3 ;
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int num3 = sc.nextInt();

        int ans = avgofthree(num1, num2, num3);

        System.out.println("The value of sum of 3 number is : " + ans );

        sc.close();



        
    }
}
