// display all the number entered by user except mutiple of 10 

import java.util.Scanner;

public class _57_continue_question {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.print("Enter a number : ");
                int num = sc.nextInt();
                if(num%10 == 0 ){
                    continue;
                }
                System.out.println(num);
            }while(true);
        }
    }   
}
