/*

    program to convert the decimal number to binary number
    
    trick = pow(10,pow) for 10(tens place) + 100(hundreds place ) = 110 

 */
public class _80_decimal_to_binary {
    public static void decitobin(int number){
        
        int bin = 0 , rem = 0 ,pow = 0 ,deci = number;
        
        while (number > 0 ) {
            rem = number % 2;
            bin = bin + ( rem * (int)Math.pow(10,pow) ); 
            number = number/2;
            pow ++ ;

        }    
        System.out.println("binary of " + deci + " is " + bin);
    }

    public static void main(String args[]){
        decitobin(4);
    }
}
