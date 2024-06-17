//program to find even and odd number 

import java.util.Scanner;

public class _31_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0 ){
            System.out.println("This is even ");
        }else{
            System.out.println("This is odd ");
        }
        sc.close();

    }    
}
