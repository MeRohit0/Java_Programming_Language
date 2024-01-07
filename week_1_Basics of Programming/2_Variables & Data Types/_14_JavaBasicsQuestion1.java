//program input 3 numbers: A ,B and C. You have to output the average of these 3 numbers.
import java.util.Scanner;
public class _14_JavaBasicsQuestion1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of B ");
        int num2 = sc.nextInt();
        System.out.println("Enter the value of C ");
        int num3 = sc.nextInt();

        int avg = (num1+num2+num3)/3;
        System.out.println("The Average of 3 numbers is : " + avg);
        sc.close();
    }
}
