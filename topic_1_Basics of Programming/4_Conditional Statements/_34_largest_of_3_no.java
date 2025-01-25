// program for the largest of 3 number 
import java.util.Scanner;
public class _34_largest_of_3_no {
    public static void main(String[] args) {
        
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        num2 = sc.nextInt();
        System.out.println("Enter the third number :");
        num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Largest is First number");
        }
        else if(num2 >= num3 ){
            System.out.println("Largest is Second number");
        }
        else 
        {
            System.out.println("Largest is Third number");
        }
        sc.close();
    
    }


}
