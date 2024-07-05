/*

    Program to check if number is even or odd using bitmanipulation 

    we know number i.e. LSB is 1 for odd number 

    0      00000000
    1      00000001
    2      00000010
    3      00000011
    4      00000100
    5      00000101

    Therefore we use & operator with 1 to check the LSB bit     ( number & 1 ) == 0

    NOTE : We use 1 as Bitmask number to check if LSB is 1 or 0 


 */
public class _142_Even_or_Odd {

    public static void evenOrOdd(int num){
        int bitmask = 1 ; 
        if( (num & bitmask) == 0 ){
            System.out.println(num +" is even number");
        }
        else{
            System.out.println(num +" is odd number");
        }
    }
    public static void main(String args[]){
        evenOrOdd(0);
        evenOrOdd(1);
        evenOrOdd(2);
        evenOrOdd(3);
        evenOrOdd(4);
        evenOrOdd(5);

    }
}
