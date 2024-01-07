//program to input the side of a square.You have to output the area of the square

import java.util.Scanner;
public class _15_JavaBasicsQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of square : ");
        float radius = sc.nextFloat();
        float area = radius * radius;
        System.out.println("Area of Square is :"+ area);
        sc.close();
    }
}
