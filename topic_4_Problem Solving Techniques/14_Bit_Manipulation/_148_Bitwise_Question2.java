/*
 * Question 2  : Swap two numbers without using any third variable.
 */
public class _148_Bitwise_Question2 {
    public static void main(String[] args) {
        int x = 10 ;
        int y = 8 ; 
        x = x ^ y ;
        y = x ^ y ;
        x = x ^ y ;
    }
}
