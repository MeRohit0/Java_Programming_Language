/*

    Write a program to print the multiplication table of a number N entered by the user

*/
import java.util.Scanner;;
public class _62_loop_question4 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            int ans = num*i;
            System.out.println(num + " X "+ i  + " = " + ans);
        }
        sc.close();
    }
}
