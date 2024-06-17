/*

    function is used to reuse the block of code which only run when they are call.
    it increase code reusibility


    function has mainly 3 parts 
    
    1.declare --> we declare the function first
    2.define --> then we define what will function will do
    3.call --> when we want to use the funtion we will call the function


    method are those function which define in class are invoked in the class are called method 
    
    #syntax of function 

        returnType name(){
            //body
            return ; 
        }


    parameters or formal parameters are written in function definition 

    arguments or actual parameters  are used in calling statement when we call function

*/

public class _69_function_and_method {
    public static void helloworld() {

        System.out.println("we are in the helloworld function");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static void main(String args[]) {

        System.out.println("we are in the main function ");
        
        helloworld();// function call 
        
        System.out.println("we are in the main function ");
    }
}