// to run the program press ctrl + shift + b 
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Math.log10(5));
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s);
        sc.close();
    }
}
