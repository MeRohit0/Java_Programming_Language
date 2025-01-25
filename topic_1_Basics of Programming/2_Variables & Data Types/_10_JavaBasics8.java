//Program for calculate area of circle 
import java.util.*;

public class _10_JavaBasics8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float radius = sc.nextFloat();

/*here the default value is double by java so we have 
to explicitly write with f for literal (3.14f)
*/      

        float area = 3.14f * radius * radius ;
        System.out.println("Area of the Circle is :" + area);
        sc.close();
    }
}
