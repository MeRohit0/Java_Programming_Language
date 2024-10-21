/*
NOTE : char ' ' space character value is 32 in integer 
    Convert the Uppercase Character to lowercase using trick of OR operator 
    we use the ' ' space character to uppercase 
    
    we cannot convert into lowercase to uppercase using | bitwise OR operator 
    as we know space (' ') value is 32 
 */
public class _150_Bitwise_Question4 {
    public static void main(String[] args) {
        for(char ch = 'A' ; ch <= 'Z' ; ch ++){
            System.out.print((char)(ch | ' '));
        }
        System.out.println();

        // we cannot convert into lowercase to uppercase using | bitwise OR operator 
        for(char ch = 'a' ; ch <= 'z' ; ch ++){
            System.out.print((char)(ch |' '));
        }
        System.out.println();
    }
    
}
