/*
    Program to print in Increasing order using recursion ( obviously )
        1 2 3 4 5 6 7 8 9 10
 */
public class _165_Print_Number_In_Incresing_Order {
    public static void printInc(int n ){
        //  function(n) = function (n - 1 ) * function(n)
        if(n == 1 ){
            System.out.print(n + " ");
            return ;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void printInc( int m , int n){
        //  function(n) = function (1 ) * function(n+1)
        if(m == n ){
            System.out.print(n + " ");
            return ;
        }
        System.out.print(m +" ");
        printInc(m+1, n);
    }

    public static void printInc2(int n ){
        printInc(1,n);
    }
    public static void main (String args[]){
        printInc(10);
        printInc2(10);
    }
}
