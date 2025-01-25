/*
    Unary operators 

1. increment 
    pre-increment      post-increment
    ++a                 a++

2. decrement 
    pre-decrement       post-decrement
    --b                 b--

    pre-increment -->   the value is change first and then use the value 
    post-increment-->   the value is use first and then change the value



 */


public class _20_unary {
    public static void main(String[] args) {
        
        //pre increment 
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("working of pre increment : " + a1);
        System.out.println("working of pre increment : " + b1);

        //post increment 
        int a2 = 10;
        int b2 = a2++;
        System.out.println("working of post increment : " + a2);
        System.out.println("working of post increment : " + b2);

        //pre decrement 
        int a3 = 10;
        int b3 = --a3;
        System.out.println("working of pre decrement : " + a3);
        System.out.println("working of pre decrement : " + b3);

        //post decrement 
        int a4 = 10;
        int b4 = a4--;
        System.out.println("working of post decrement : " + a4);
        System.out.println("working of post decrement : " + b4);

        
    }    
}
