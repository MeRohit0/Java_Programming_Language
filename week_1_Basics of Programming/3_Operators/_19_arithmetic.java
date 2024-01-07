/*  Arithmetic operators 

Unary operator
++  (increment)
--  (decrement)


binary operator (i.e. a(operand) +(operator) b(operand) )
   
    +(addition)         --> a + b 
    -(subtraction)      --> a - b
    *(multiplication)   --> a * b
    /(division)         --> a / b
    %(modulo)           --> a % b
    
    
 */

class _19_arithmetic{
    public static void main(String args[]){
        int a = 42;
        int b = 23;
        System.out.println("add = " + (a+b));
        System.out.println("sub = " + (a-b));
        System.out.println("mul = " + (a*b));
        System.out.println("div = " + (a/b));
        System.out.println("mod = " + (a%b));
    }
}