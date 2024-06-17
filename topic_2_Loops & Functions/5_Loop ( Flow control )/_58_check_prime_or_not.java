/*
check if a number is prime or not prime 
input is given by user 
 */
import java.util.*;
public class _58_check_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        
        boolean isPrime = true;
        if(number == 2){
            System.out.println( number +" is a Prime Number ");
        }
        else{
            for(int i = 2 ; i < Math.sqrt(number) ; i++ ){
                if( number % i == 0 ){
                    isPrime = false;
                }
            }
        }

        if(isPrime == true){
            System.out.println(number+" is a Prime Number");
        }else{
            System.out.println(" Not a Prime Number");
        }
        sc.close();
    }
}
