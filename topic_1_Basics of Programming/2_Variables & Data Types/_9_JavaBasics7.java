//Program for the sum and mutiple of two variable a and b 
import java.util.*;

public class _9_JavaBasics7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a * b ;
        System.out.println("Sum of a + b : " + sum);
        System.out.println("Product of a + b : " + product);
        sc.close();

    }
}
