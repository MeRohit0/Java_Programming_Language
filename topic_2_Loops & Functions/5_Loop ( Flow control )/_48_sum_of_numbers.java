/*
    sum of first n natural numbers 
    when n = 5 ;
    sum = 1+2+3+4+5 = 15 
*/
import java.util.Scanner;
public class _48_sum_of_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1 ;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of "+sum);
        sc.close();
    }
}
