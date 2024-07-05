/*
    overloading using different parameters 

    and then 

    overloading using different data types

 */

public class _76_function_overloading {

    //overloading using parameter
    // public static int sum ( int a , int b ){
    //     return a+b;
    // }

    public static int sum (int a , int b, int c ){
        return a + b + c;
    }

    //overloading using datatype
    public static float sum (float a , float b){
        return a + b;
    }

    public static void main(String args[]){
        //this is used to call the function
        System.out.println(sum( 4, 3,1 ));

        
        // this can be used to call int return type and float return type
        System.out.println(sum( 5f, 3f ));
    }
}
