/*
    draw a solid rhombus
        *****   space = 4 , star = 5
       *****    space = 3 , star = 5
      *****     space = 2 , star = 5
     *****      space = 1 , star = 5
    *****       space = 0 , star = 5

 */

import java.util.Scanner;

public class _87_solid_rhombus {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n to print solid rhombus : ");
    int n = sc.nextInt();


    //outer loop
    for(  int line = 1  ;   line <= n ; line ++ ){
        //lnner loop 
        //for space 
        for (int i = 1; i < n - line + 1  ; i++) {
            System.out.print("  ");
        }
        //for star 
        for (int j = 1; j <=n; j++) {
            System.out.print("* ");
        }
        // print nextline 
        System.out.println();
    }
sc.close();

}
    
}