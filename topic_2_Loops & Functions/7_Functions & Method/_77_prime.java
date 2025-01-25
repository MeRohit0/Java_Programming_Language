/* 
    program to find primenumber 
    but second method is more optimised for checking prime numbers 2 to sqrt(n)
*/
import java.util.Scanner;

public class _77_prime {

    // public static boolean isPrime(int number){
    //     boolean primenum = true;
    //     if(number == 2 ){
    //         return primenum;
    //     }
    //     for(int i = 2 ; i <= number - 1; i ++){
    //         if(number%i == 0 ){
    //             primenum = false; 
    //             return primenum;
    //         }
    //     }
    //     return primenum;
    // }



/*
        here the value of this loop is go from 2 to sqrt(n) its more optimised 
        because the prime number have to compare more case then non prime number
        as the non prime number is terminate soon and  prime number will have to
        compare more iteration to completely check all the cases 
*/


    public static boolean isPrime(int number){
        boolean primenum = true;
        if(number == 2 ){
            return primenum;
        }
        
        for(int i = 2 ; i <= Math.sqrt(number); i ++){
            if(number%i == 0 ){
                primenum = false; 
                return primenum;
            }
        }
        return primenum;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.print("Enter a number (for exit press 0: )");
        int number = sc.nextInt();
        if(number == 0 ){
            break;
        }
        else{
            if(isPrime(number) == true ){
                System.out.println(number +" is a Prime number");
            }
            else{
                System.out.println(number +" is Not a prime number");
            }
        }

    }
    sc.close();
}
}
