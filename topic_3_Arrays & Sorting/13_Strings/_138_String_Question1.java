/*
    Program for Count how many times lowercase vowels occurred in a String entered by the user.

    time complexity - O(n)
    
 */
import java.util.Scanner;
public class _138_String_Question1 {
    public static void main(String args[]){
        // count no of lowercase vowels 
        Scanner sc = new Scanner (System.in);
        // take input 
        String str = sc.nextLine();
        // parsing and increase the count variable each time
        int count = 0 ; 
        char num = 97 ; 

        for(int i = 0 ; i < str.length(); i++){
            if ( str.charAt(i) == num || str.charAt(i) == num+4 ||str.charAt(i) == num+8 || str.charAt(i) == num+14 || str.charAt(i) == num+20 )
            // char num = 97 ;
            count ++;
        }
        System.out.println(count);  

        sc.close();
    }   
}
