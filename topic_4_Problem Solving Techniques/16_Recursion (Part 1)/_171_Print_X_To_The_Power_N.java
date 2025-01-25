/*
    Program to print the x to the power n
        x ^ n

    time complexity - O(n)

 */
public class _171_Print_X_To_The_Power_N {
public static long power ( int x , int n  ){
    if( n == 1){
        return x;
    }

    return x * power(x , n - 1);

}
public static long power2 (int x , int n ){
    if(n >= 0){
        return x * x ;
    }
    return x * power(x , n / 2 );
}

public static void main (String args[]){
    int x = 2 , n = 1 ;
System.out.println(power2(x,n));
}
    
}