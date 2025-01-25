/*
    Program to print the factorial of n 
    5! = 5*4*3*2*1
 */
public class _164_Factorial_Of_N {

    public static int fact(int n ){
        if(n == 0 ){
            return 1;
        }
        int fn = n * fact(n - 1);
        return fn ;
    }
    public static void main(String args[]){
        int n =  5;
        System.out.println("Factorial of "+ n +" is : "+ fact(n));
    }
}
