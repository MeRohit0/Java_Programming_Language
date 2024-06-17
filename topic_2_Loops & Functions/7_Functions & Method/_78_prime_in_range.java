/*
    print the all prime number from 2 to n 
 */


public class _78_prime_in_range {

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

    public static void primesInRange(int number){
        
        //call the isprime function 
        
        for(  int i = 2 ; i<= number ; i++ ){

            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        System.out.println("Prime number from 2 to n is : ");
        primesInRange(1000);

    }
}
