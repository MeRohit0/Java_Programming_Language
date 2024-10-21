/*
    
    NOTE : ~0 or -1 is 11111111 in bits
    
Program to clear the last i bits 

        num = 1111 (15) and i = 2 
        we want to clear last 2 bits 
        num = 1100

        approch 
                bitmask = ~0 << i ;
                num & bitmask 

-----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----   

Program to clear the range of bits 

        input -     num = 00001111 (15) and i = 2 and j = 5 
        we want to clear the range from i to j 
        output -    num = 00000011

        approch-

                a = ~0 << j+1           we add +1 to include in the range              
                b = (1 << 2 ) - 1       left shif give multiple of 2 
                bitmask = a | b 
                num & bitmask 

-----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----   -----

Program to check if the number is a power of 2 or not 

        approch -   
                  
                num = 0000 0100  (4)    &     0000 0011   num - 1 i.e. (3)   we get -->    0000 0000
                num & (num - 1 ) == 0 ? True : False
                we know that if we do & operation with num & (num - 1 ) == 0 then its in come in power of 2 
                otherwise its not come in power of 2 




 */
public class _144_Clear_last_i_bits {
    public static int clearLastIBits( int num , int i ){
        //use inverse of 0 
        int bitmask = (~0) << i;
        return num & bitmask ;
    }
    public static int clearRangeOfBits(int num , int i , int j ){
        int a = (~0) << j + 1;
        int b = (1 << i) - 1 ; 
        int bitmask = a | b ;
        num = num & bitmask ;
        
        return num;
    }
    public static boolean isPowerOfTwo(int num ){
        return (num &( num -1 )) == 0 ;
    }

    public static void main(String args[]){

        System.out.println(clearLastIBits(10, 2));

        System.out.println(clearRangeOfBits(10, 2, 4));

        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));

    }
}
