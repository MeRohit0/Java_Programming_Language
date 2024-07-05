/*
    progrma to check if the string is palindrome 
    i.e. racecar  ,  noon  

    remember capital letter and small letter are different 

    Approach : check first character and last character till n / 2 

    time complexity --> O(n)
 */
public class _132_palindrome {

    public static boolean ispalindrome(String str){
        int n = str.length();
        for(int i = 0 ; i < n/2 ; i++ ){
            if( str.charAt(i) != str.charAt(n - 1 - i ) ){
                //not a palindrome 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(ispalindrome(str));
        String str2 = "racecar";
        System.out.println(ispalindrome(str2));
    }
}
