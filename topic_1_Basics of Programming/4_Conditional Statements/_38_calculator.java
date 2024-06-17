// Basic calculator using switch 
// must try divide by zero exception ^_~

import java.util.Scanner;

public class _38_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int num1 = sc.nextInt();
        System.out.println("Enter value of b ");
        int num2 = sc.nextInt();
        System.out.println("Enter operator from ( + , - , / , * , % ) ");
        char ch = sc.next().charAt(0);
        try{

            switch(ch){
                case '+' : System.out.println(num1+num2);
                break;
                case '-' : System.out.println(num1-num2);
                break;
                case '/' : System.out.println(num1/num2);
                break;
                case '*' : System.out.println(num1*num2);
                break;
                case '%' : System.out.println(num1%num2);
                break;
            }
        }
        catch(Exception e){
            System.out.println("Zero se divide karne ki jurum main apko 2 year ki saja or 15Lakh ka fine hai ya fir dono hosakti hai ");
        }
            sc.close();
    }
}
