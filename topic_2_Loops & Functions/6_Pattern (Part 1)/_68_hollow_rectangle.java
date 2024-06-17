/*
print hollow rectangle 

no of symbol is n = 5 

* * * * *
*       *
*       *
* * * * *

step 1 : outer loop 
        no of line = n-1 (here n = 5)

step 2 : symbol  
        no of symbol = either 5 star or 2 stars (one in starting and one in ending )

step 3 : next line 

*/

import java.util.Scanner;

public class _68_hollow_rectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the hollow rectangle");
        System.out.print("Enter the value of n (value greater then 4): ");
        int n = sc.nextInt();

        // outer loop --- for printing no of lines 
        for(int line = 1 ; line <= n-1 ; line ++ ){
            //print star
            if(line == 1 || line == n-1){
            //print star at star and end only
                for(int j = 1 ; j <= n ; j ++){
                    System.out.print("* ");
                }
            }
            else{
            //print star between star and end value of lines 
            for(int j = 1 ; j <=n ; j++)
                if(j == 1 || j == n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
