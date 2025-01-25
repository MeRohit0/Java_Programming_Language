/*
    Program to print the x to the power n (Optimized)
        x ^ n
    
        Method 2 : time complexity - O(log n )

        we achive this by  multiply xnb2 * xnb2 instead of 1 more 
            recursion call as they both are same , this save exponential time 
 */
public class _172_Print_X_To_The_Power_N_Optimized {
    

    public static long optimizedPower(int x , int n ){
        //base case 
        if(n == 0 ){
            return 1 ;
        }

        //even case     xn = x^(n/2) * x ^ (n/2)
        long xnb2 =  optimizedPower(x, n /2 );
        long xn = xnb2 * xnb2 ;  
        // here we optimized by multiply xnb2 * xnb2 instead of 1 more 
            // recursion call as they both are same 

        //odd case      xn =  x * x^(n/2) * x ^ (n/2)
        if(n%2 != 0){
            xn = x * xn  ;
        }
        return xn;
    }
    public static void main(String args[]){
        int x = 2 ;
        int n = 5 ;
        System.out.println(optimizedPower(x, n) );
    }
}
