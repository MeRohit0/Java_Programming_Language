/*
    convert the binary number to decimal number 
    Math.pow(base, power)
*/
public class _79_binary_to_decimal {

    public static void bintodeci(int n ){
        
        int binary = n ;
        int decimal = 0 ; 
        int pow = 0 ;
        
        while ( n   >   0){

            int LB = n % 10 ;
            decimal = decimal + (LB * (int)Math.pow(2, pow));
            pow++;
            n/=10;
        
        }
        System.out.print("decimal of "+ binary +" = " +decimal);
    }
    public static void main(String args[]){
        bintodeci(1001);
    }
}
