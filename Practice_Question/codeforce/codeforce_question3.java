package Practice_Question.codeforce;
/*

ACCEPTED ✌️
Petya loves lucky numbers. We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Unfortunately, not all numbers are lucky. Petya calls a number nearly lucky if the number of lucky digits in it is a lucky number. He wonders whether number n is a nearly lucky number.

Input
The only line contains an integer n (1 ≤ n ≤ 1018).

Please do not use the %lld specificator to read or write 64-bit numbers in С++. It is preferred to use the cin, cout streams or the %I64d specificator.

Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes).

Examples
inputCopy
40047
outputCopy
NO
inputCopy
7747774
outputCopy
YES
inputCopy
1000000000000000000
outputCopy
NO
 */

import java.util.Scanner;

public class codeforce_question3 {
    
public static void main(String args[]){
    //input
    Scanner sc = new Scanner(System.in);
    String t = sc.nextLine();
    String value = "NO";

    int count = 0 ;
    int i = 0 ;
    while( i < t.length() ){

        char num = t.charAt(i);
        if((num == '7'|| num=='4')){ count ++ ;}
        i++ ;
    }
    if(count == 4 || count == 7){
        value = "YES";
    }
    System.out.println(value);
    sc.close();
}
    
}
