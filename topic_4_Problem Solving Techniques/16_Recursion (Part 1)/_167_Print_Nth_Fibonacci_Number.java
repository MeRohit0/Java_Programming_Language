/*
    Program to print the nth fibonacci number
        0 1 1 2 3 5 8 13 21 34 ...

        F(n) = F(n-1) + F(n-2) ;

        space complexity - O(n)
        time complexity - O(2^n)
 */
public class _167_Print_Nth_Fibonacci_Number {
    public static long fibbonacci(long n ){
        if(n == 1 || n == 0 ){
            return n;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 25 ; 
        System.out.println(n +"th Fibbonacci number is "+fibbonacci(n));
        System.out.println(n +"th Fibbonacci number is "+fibbonacci(50)); //takes 1 min and 17 seconds
    }
}
