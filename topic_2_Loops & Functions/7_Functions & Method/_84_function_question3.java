/*
    Write a Java program to check if a number is a palindrome in Java?
    (121 is a palindrome, 321 is not)
 */

 import java.util.Scanner ;
public class _84_function_question3 {
    public static boolean ispalindrome(int number ){
         int temp = 0 ;
        int number1 = number ;
         while (number1 > 0) {
            temp  = temp*10 + number1 % 10 ;
            number1 /= 10 ;
         }
         if (temp == number )
            return true;
         else
            return false ;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System. in ); 
        System.out.print("Enter a number :");
        int number = sc . nextInt();
        if (ispalindrome(number) == true )
            System.out.println( number +" is a palindrome" );
        else 
            System.out.println(number + " is Not a palindrome ");
        sc.close();
    }
}
