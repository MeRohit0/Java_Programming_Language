/*
    
Program to check if ith bit is even or odd using bit manipulation 

    1. Get ith operation
    2. Set ith operation
    3. Clear ith operation
    4. Update ith operation

    1. Get ith operation

        I want to know the value of 2th bit in number 15
    
        0 0 0 0 1 1 1 1 (15)   
        | | | | | | | |
        7 6 5 4 3 2 1 0        ith bit position 

        for example i = 2 
        
        we will do the operation    -->     num & (1<<i)
        because & operator will only get the 1 if we have another 1 ;
        
        if we do 00000001 << ith bit we will get 00000100
        
        if result != 0  then the value at ith bit is 1 else 0 
        

    2. Set ith operation
        
        I want to set the value of 2th bit in number 10
        set means we will set the value to 1 
    
        0 0 0 0 1 0 1 0 (10)   
        | | | | | | | |
        7 6 5 4 3 2 1 0        ith bit position 

        for example i = 2 
        
        if we do 00000001 << ith bit we will get 00000100

        we will do the operation    -->     num | (1<<i)
        because | operator will set the value 1 regardless another value

    3. Clear ith operation
        
        I want to clear the value of 2th bit in number 12
        clear means we will set the value to 0 
    
        0 0 0 0 1 0 1 0 (10)   
        | | | | | | | |
        7 6 5 4 3 2 1 0        ith bit position 

        for example ith position = 2 
        
        if we do ~(00000001 << ith) bit we will get ~(00000100) we get 11111011 
        

        we will do the operation    -->     num & (~(1<<i))
        because & operator will clear the value regardless another value
    
    4. Update ith operation

        We want to either set the value or clear the value at the ith bit position


    

 */

 public class _143_operation_on_ith_bit{
    public static int getIthBit(int num , int i ){
        int bitmask = 1 << i ;
        if( (num & bitmask ) == 0  ){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int num , int i ){

        int bitmask = 1 << i ;
            return num | bitmask ;
        
    }
    public static int clearIthBit(int num , int i ){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }
    public static int updateIthBit(int num , int i, int bitvalue){
        // METHOD 1 :
        // if(bitvalue == 0 ){
        //     return clearIthBit(num, i);
        // }else if (bitvalue == 1){
        //     return setIthBit(num, i);
        // }
        // System.out.println("Incorrect in updateithbit ");
        // return bitvalue;

        // METHOD 2 : if we have to not use the clearIthbit or setIthvalue directly or 
                    // we have to use partially or any other combination
        
        
        //clear the bit 
        num = clearIthBit(num, i);
        //set the value 
        int bitmask = bitvalue << i;
        return num | bitmask;



    }
    public static void main(String[] args) {

        System.out.println("We will Get value from here ");
        System.out.println(getIthBit(15, 2));   // 00001010  we get 1
        System.out.println(getIthBit(10, 2));   // 00001010  we get 0
        System.out.println(getIthBit(10, 3));   // 00001010  we get 1

        System.out.println("We will Set value from here ");
        System.out.println(setIthBit(10, 3));    //00001010 we get 00001010
        System.out.println(setIthBit(1, 3));    //00000001 we get 00001001
        
        System.out.println("We will Clear value from here ");
        System.out.println(clearIthBit(12, 3));    //00001100 we get 00000100
        System.out.println(clearIthBit(10, 1));    //00001010 we get 00001000
        
        System.out.println("We will update value from here ");
        System.out.println(updateIthBit(10, 1 , 0));    //00001010 we get 00001000


    }
 }