// Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner ;
public class _39_Conditional_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println(" Let zero is a Positive Number ");
        }
        else if(number > 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
        sc.close();
    }
}
