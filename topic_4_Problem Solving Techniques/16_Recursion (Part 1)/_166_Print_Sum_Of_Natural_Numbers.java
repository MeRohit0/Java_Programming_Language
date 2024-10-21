/*  
    Program to print the sum of n natural number
    input : 5
    output : 15  
 */
public class _166_Print_Sum_Of_Natural_Numbers {
    public static int sum (int n ){
        if(n == 1){
            return 1 ;
        }
        int nSum = n + sum(n - 1);
        return nSum;
    }
    public static void main(String args[]){
        int n = 18200;
        System.out.println("Sum of n natural number from 1 to " + n + " is : " + sum(n));
    }
}
