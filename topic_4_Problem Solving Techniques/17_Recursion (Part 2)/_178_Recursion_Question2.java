/*

Question 2 :
    You are given a number (eg -  2019), convert it into a String of english like
    “two zero one nine”.  Use a recursive function to solve this problem.
    NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
    can’t be 0.

    Sample Input : 1947
    Sample Output : “one nine four seven”

 */
public class _178_Recursion_Question2 {
    public static String convertIntToString(int n ){

        //base case
        if(n == 0){
            return "";
        }

        //working
        int number = n % 10 ;
        String intToString = "";
        switch(number){
            case 0 : { intToString += "zero" ; break;}
            case 1 : { intToString += "one" ; break;}
            case 2 : { intToString += "two" ; break;}
            case 3 : { intToString += "three" ; break;}
            case 4 : { intToString += "four" ; break;}
            case 5 : { intToString += "five" ; break;}
            case 6 : { intToString += "six" ; break;}
            case 7 : { intToString += "seven" ; break;}
            case 8 : { intToString += "eight" ; break;}
            case 9 : { intToString += "nine" ; break;}
            default:{System.out.println("Error"); break;}
        }
        n /= 10 ;
        if (n > 0 ) {
            intToString = " " + intToString;            
        }
        //next recursive call 
        intToString = convertIntToString(n) + intToString ; 
        
        return intToString;
    }

    public static void main (String args[]){
        System.out.println(convertIntToString(2024));
    }
}
