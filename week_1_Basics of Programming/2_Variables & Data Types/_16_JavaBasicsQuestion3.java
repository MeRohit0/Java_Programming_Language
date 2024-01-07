/*  
    Enter cost of 3 items from the user(using float datatype)- a pencil,a pen and an eraser. 
    You have to output the total cost of the items back to the user as their bill.
*/
import java.util.Scanner;
public class _16_JavaBasicsQuestion3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Enter the value of pencil , pen and eraser from user 
        
        System.out.println("Enter the value of pencil");
        float item1 = sc.nextFloat();
        System.out.println("Enter the value of pen");
        float item2 = sc.nextFloat();
        System.out.println("Enter the value of eraser");
        float item3 = sc.nextFloat();
        
        //total cost of item including tax 

        float price = item1 + item2 + item3 ;
        float price_include_gst = (int)(price * 1.18);
        System.out.println("The Price of item is :" + price);
        System.out.println("The Price of item including 18% GST is  :" + price_include_gst);
        sc.close();

    }
        
}
