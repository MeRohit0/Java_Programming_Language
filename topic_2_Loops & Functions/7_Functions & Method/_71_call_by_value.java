/*

    In java Call by value is used not call by reference 

    here we change the value of variable by call by value in java new copy 
    of variable is given to new function 

*/

 public class _71_call_by_value {
public static void main(String args[]){
    
    //swap - values exchange
    int a = 10;
    int b = 5; 
    
    System.out.println("a = " + a );
    System.out.println("b = " + b);

    //swap
    int temp = a;
    a = b ;
    b = temp;

    System.out.println("a = " + a );
    System.out.println("b = " + b);


}
    
}