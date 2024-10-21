/*
    Question 3 : Add 1 to an integer using Bit Manipulation.

    when ever we use ~ bitwise not operator 
    we get 2's complement of that number but we get in inverse sign too
    
 */
public class _149_Bitwise_Question3 {
    public static void main(String[] args) {
        int number = 5 ; 
        System.out.println("Before number : " + number);
        System.out.println("After number : " + -(~number));
    }
}
