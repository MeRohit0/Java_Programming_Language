package Practice_Question.codeforce;
/*
A. Way Too Long Words
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

 */
import java.util.Scanner;
public class codeforce_question2 {
public static void main(String args[]){
    //input
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-- > 0){

        String str = sc.nextLine();
        if(str.length() > 10 ){
            System.out.print(str.charAt(0) );
            System.out.print(str.length() -2 );
            System.out.print(str.charAt(str.length() - 1 ));
            System.out.println();
        }
        else{
            System.out.println(str);
        }
    }
    
    sc.close();
}
    
}
