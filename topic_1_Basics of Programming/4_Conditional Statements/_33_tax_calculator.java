// tak calculator for estimate tax 
import java.util.Scanner;
public class _33_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;
        if ( income <= 500000 ){
            tax = 0 ;
        }
        else if ( income > 500000 && income < 1000000 ){
            income -=500000;
            tax = (int)(income * 0.2) ; 
        }
        else {
            income -=1000000;
            tax = (int)(income *0.3);
            tax += 100000;
        }
        System.out.println("Your Tax will be : " + tax);
        sc.close();
    }
}
