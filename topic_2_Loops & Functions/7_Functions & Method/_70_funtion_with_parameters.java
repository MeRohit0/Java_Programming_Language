/*

    here we will use the function with parameters pass the argument when we call the function 

    syntax of function with parameters
    
    returnType name(type param1 , type param2){
        //body
        return statement;
    }

    parameters or formal parameters are written in function definition 

    arguments or actual parameters  are used in calling statement when we call function
    
    when we write function in java the call stack track the function has all the 
    variable in the stack which funtion is called first 

*/

import java.util.Scanner;
public class _70_funtion_with_parameters {
    public static int  calculateSum(int num1 , int num2){ //parameters or formal parameters 
        int sum = num1 + num2;
        return sum ; 
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Enter value of a :");
        int a = sc.nextInt();
        
        System.out.print("Enter value of b :");
        int b = sc.nextInt();
        
        int sum = calculateSum( a ,b );     //arguments or actual parameters
        System.out.println("Sum of a + b : " + sum);
        sc.close();
    }
}
