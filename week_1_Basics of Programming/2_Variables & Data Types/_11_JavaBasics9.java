/*  Program for Type conversion (also knows as implicite conversion & widening conversion)
Conversion happen when :
1. type Compatible 
2. destination type > source type    

Byte -> short -> int -> float -> long -> double 

*/
import java.util.Scanner;
public class _11_JavaBasics9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number : ");
        // String num1 = sc.nextInt();
        float num1 = sc.nextInt();
        System.out.println("The entered number is : " + num1);
        sc.close();
    }
}
