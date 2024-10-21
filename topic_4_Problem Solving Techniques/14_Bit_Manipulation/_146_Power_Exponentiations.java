/*
    Program to get the power of the exponentiation in log n time 
    
        pow(2,21) = 2 ^ 21              (   x ^ n   )
        Time complexity = O( log n )

        Approach 
                 - we initialize variable ans = 1 
                 - we take power (n) of base number (x) = 2 ^ 21
                 - if n is even we mutiply the x * x and n / 2 because we can write 
                    
                    2 ^ 20 = (2 ^ 2 ) ^ (20 / 2) 
                    which means we can take square of x 
                    and we divide the n / 2 

                 - else incase of odd value of n 

                    2 ^ 21 = 2 ^ 20 * 2 ^ 1 
                    in this we make n's value to even by subtracting - 1 from n and multiple the 
                    value of ans * x so that we will return this value 

-----       -----       -----       -----       -----       -----       -----       -----       -----       -----       -----

        Method 2 : Approach 
                - we convert the power into binary number i.e 3 ^ 5 
                    
                    5 =  0 0 0 0 0 1 0 1
                                   | | |
                                  a^3| a^1
                                    a^2
                                    
                - Initialize the variable ans = 1 
                - in place of 1 in bit we will perform two operations ans = ans * x; and x = x *x ;
                    and in place of 0 bit we will only x = x * x ;
                - we will right shift operator the 00000101 >> 1 we get 00000010
                - we will continue this loop from 2 line to this line until n > 0 ;
                 

 */
public class _146_Power_Exponentiations {
    //Method 1 
    public static int power_exponentiation(int x , int n ){
        int ans = 1 ;
        while (n > 0 ){
            if( n % 2 == 0 ){
                //even value of n 
                n = n / 2 ; 
                x = x * x ;
            }else{
                //odd value of n
                ans = ans * x ; 
                n = n - 1 ;
            }
        }
        return ans; 
    }
    //for myself 
    public static long power(long x ,long n ){
        while (n > 0 ){
            x = x * x;
            n--;
        }
        return x ;
    }

    //Method 2 
    public static int power_exponentiation2(int x , int n ){
        int ans = 1 ; 
        while (n > 0 ){
            if( ( n & 1 ) == 1 ){
                ans = ans * x ;
                x = x * x ;
            }
            else{
                x = x * x ;
            }
            n = n >> 1;             //  right shift operator
        }
        return ans;
    }
    public static void main(String args[]){
        int x = 2;
        int y = 30 ; 
        System.out.println("Value of " + x +" ^ " + y +" = " + power_exponentiation(x, y));
        
        System.out.println(power(2,20));

        System.out.println(power_exponentiation2(x, y));
    }
}
