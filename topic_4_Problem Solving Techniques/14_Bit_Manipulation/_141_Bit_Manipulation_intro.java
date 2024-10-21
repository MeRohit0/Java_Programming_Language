/*
Bit Manipulation 
    
    binary number has 0 & 1 computer only understand the binary numbers
    we can convert the binary number into decimal and vice- versa
    
    bitwise operator are 

    1. AND &
    2. OR |
    3. XOR ^
    4. ONE's Compliment ~
    5. Binary Left Shift <<
    6. Binary Right Shift >>


 */
public class _141_Bit_Manipulation_intro {

    public static void andOperator(int a, int b){
        //AND OPERATOR 

        //  A   B   &
        // -----------
        //  0   0   0
        //  0   1   0
        //  1   0   0
        //  1   1   1

        System.out.print("AND Operator of " + a + " & " + b+" is : ");
        System.out.println( a & b );
    }
    public static void orOperator(int a, int b){
        //OR OPERATOR 

        //  A   B   |
        // -----------
        //  0   0   0
        //  0   1   1
        //  1   0   1
        //  1   1   1

        System.out.print("OR Operator of " + a + " | " + b +" is : ");
        System.out.println( a | b );
    }
    public static void xorOperator(int a, int b){
        //XOR OPERATOR 

        //  A   B   ^
        // -----------
        //  0   0   0
        //  0   1   1
        //  1   0   1
        //  1   1   0

        System.out.print("XOR Operator of " + a + " ^ " + b +" is : ");
        System.out.println( a ^ b );
    }
    public static void oneComplement(int a ){
        //ONE'S Complement 

        //  A  |  ~A
        // ----|------
        //  0  |   1
        //  1  |   0

        /*
            8 bit memory representation of number 5
            00000101 (5)
            ^      ^
            |      |
            MSB    LSB
                
                Most Significant Bit (MSB) and Least Significant Bit (LSB)
                
                MSB value 0 -- positive number
                          1 -- negative number


            In computer we represent the negative number by MSB therefore whenever computers 
            Read 1 in MSB position we proceed with 2's Complement 

            STEP 1 : When we complement ~5 
                        we get 11111010 
                    
            STEP 2 : Its check MSB if (MSB = 1) it will proceed with 2's Complement 

            STEP 3 : 2's Complement of 11111010 

                        complement of (11111010) we get     00000101 
                        and wew add +1 (00000001)         + 00000001
                                                            --------
                        result  number                      00000110 (-6) 
                        we add - because its follow 2's Complement procedure 


         */


        System.out.print("One's Complement of  ~(" + a + ") is : ");
        System.out.println( ~a );
    }
    public static void leftShiftOperator(int num, int shift_value){
        //LEFT SHIFT OPERATOR 
        // Its means multiply the number by 2 ^ shift_value ;
        // A << B = A * 2 ^ B
        // A = 3 ; // 00000011
        //  A << 2   // 00001100

        System.out.print("LEFT SHIFT Operator of " + num + " << " + shift_value +" is : ");
        System.out.println( num << shift_value );
    }
    public static void rightShiftOperator(int num, int shift_value){
        //RIGHT SHIFT OPERATOR 
        // Its means divide the number by 2 ^ shift_value ;
        // A >> B = A / 2 ^ B
        // A = 5 ; // 00000101
        //  A >> 2   // 00000001

        System.out.print("LEFT SHIFT Operator of " + num + " >> " + shift_value +" is : ");
        System.out.println( num >> shift_value );
    }

    public static void main(String args[]){

        int a = 5 ;     // 00000101
        int b = 6 ;     // 00000110
        int value = 5;  // 11111010
        int shift_value = 2 ; // 00000010
        

        // bitwise operator 

        andOperator(a,b);                   // 1. AND &
        orOperator(a, b);                   // 2. OR |
        xorOperator(a,b);                   // 3. XOR ^
        oneComplement(value);               // 4. ONE's Compliment ~
        leftShiftOperator(a, shift_value);     // 5. Binary Left Shift <<
        rightShiftOperator(a, shift_value);    // 6. Binary Right Shift >>

    }
}
