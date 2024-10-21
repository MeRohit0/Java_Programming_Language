/*
    Question1: Print the sum , difference and product of two complex numbers by creating a class named 
    'Complex' with separate methods for each operation whose real and imaginary parts are entered
    by the user.

 */

public class _161_Object_Oriented_Programming_Question_1{
    public static void main (String args[]){
        //input the complex number 
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);

        Complex e = Complex.sum(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.mul(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
        
        
    }
}
class Complex {
    //      1 + 3i

    private int real ;
    private int imag ;

    //setter 
    Complex(int r , int i ){
        real = r ;
        imag = i ;
    }
    
    void printComplex( ){
        System.out.println(this.real+ " + i " + this.imag);
    }

    // static Complex sum(Complex num1 , Complex num2){
    // Complex num = new Complex(0,0);
    //     num.real = num1.real + num2.real ; 
    //     num.imag = num1.imag + num2.imag ; 
    //     return num;
    // }

    static Complex sum(Complex num1 , Complex num2){
        return new Complex(num1.real + num2.real ,num1.imag+num2.imag);
    }

    // static Complex diff(Complex num1 , Complex num2){
    //     Complex num = new Complex (0 , 0 );
    //     num.real = num1.real - num2.real ;
    //     num.imag = num1.imag - num2.imag ;
    //     return num;
    // }
    static Complex diff(Complex num1 , Complex num2){
        return new Complex(num1.real - num2.real,num1.imag - num2.imag);
    }
    // static Complex mul (Complex num1 ,Complex num2){
    //     Complex num = new Complex(0, 0);
    //     num.real = num1.real * num2.real ;
    //     num.real -= num1.imag * num2.imag ;
    //     num.imag = num1.real * num2.imag ;
    //     num.imag += num1.imag * num2.real ;
    //     return num;
    // }
    static Complex mul (Complex num1 ,Complex num2){
        return new Complex ((num1.real * num2.real) - (num1.imag * num2.imag) ,
        (num1.real * num2.imag) +(num1.imag * num2.real) );
    }
    
}