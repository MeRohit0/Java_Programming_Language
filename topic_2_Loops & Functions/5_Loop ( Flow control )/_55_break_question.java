/*
    Write a program for taking user input and print the output but 
    exit if any mutiple of 10 is input 
*/
import java.util.Scanner;
public class _55_break_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num%10 == 0 ){
                break;
            }
            System.out.println(num);
        }while(true);
        sc.close();
    }
}
