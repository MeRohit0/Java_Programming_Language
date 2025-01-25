/*
    Here we are going to calculate the Time Complexity of 3 methods 
    1. O(n)
    2. O(n)
    3. O(logn)
 */
public class _188_Power_Function {

    //Time complexity - O( n )
    public static int power1(int a , int n ){ // a ^ n
        if(n==0){
            return 1;
        }
        return a * power1(a,n-1);
    }


    // Time Complexity -   O(  2 ^ log n  ) --->    O( n ) 
    public static int power2(int a , int n) // a ^ n
    {
        if( n == 0 ){
            return 1 ;
        }

        int halfpowersq = power2(a, n/2) * power2(a,n/2);

        if(n % 2 != 0 ){
            halfpowersq *= a;
        }

        return halfpowersq;
    }
    
    // Time Complexity - O(log n )
    public static int power3(int a , int n) // a ^ n
    {
        if( n == 0 ){
            return 1 ;
        }

        int halfpower = power3(a, n/2);
        int halfpowersq = halfpower * halfpower;

        if(n%2 != 0 ){
            halfpowersq *= a;
        }

        return halfpowersq;
    }
    public static void main(String[] args) {
        int a = 2 ;
        int n = 10;
        System.out.println(power1(a, n));
        System.out.println(power2(a, n));
        System.out.println(power3(a, n));
    }
}
