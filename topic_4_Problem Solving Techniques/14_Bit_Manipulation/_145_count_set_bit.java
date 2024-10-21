/*
    Program to count the set bits in the number 

        in this we have to count the number of 1 in the number 

    approach - 
                
                we know that the odd number's LSB has 1 so we check if the number is even or odd by (num & 1 << 0 )
                we use the right shift operator to remove the right most part 
                

 */
public class _145_count_set_bit {
    public static int countSetBit(int num ){
        int count = 0 ; 
            while (num > 0 ){
                if( ( num & 1 ) != 0 ){ // check on LSB
                    count++ ;
                }
                num = num >> 1;
            }
            return count ;
        }

    public static void main (String args[]){
        int num = 15; 
        System.out.println(countSetBit(num));
    }
}
