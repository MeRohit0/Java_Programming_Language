package Practice_Question.codeforce;

/*
Given a two-digit positive integer n, find the sum of its digits.

Input
The first line contains an integer t(1 ≤ t ≤ 90) — the number of test cases.

The only line of each test case contains a single two-digit positive integer n(10≤n≤99).

Output
For each test case, output a single integer — the sum of the digits of n
.
 */
import java.util.Scanner;
public class codeforces_round_964_Div_4_Question_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t=  input.nextInt();
        while(t -- > 0 ){
            int sum = 0;
            int n =  input.nextInt();
            sum += n%10;
            n /= 10 ;
            sum += n%10;

            System.out.println(sum);
        }
        input.close();
    }
}
