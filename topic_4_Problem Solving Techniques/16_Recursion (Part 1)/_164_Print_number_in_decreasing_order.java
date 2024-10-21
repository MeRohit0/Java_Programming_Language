/*
    Program to print in decreasing order using recursion ( obviously )
        10 9 8 7 6 5 4 3 2 1
 */
public class _164_Print_number_in_decreasing_order {

    //recursion call 
    public static void printDec(int n ){
        if(n == 1 ){
            System.out.print(n + " ");
            return ; 
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main (String args[]){
        printDec(10);
    }
}
