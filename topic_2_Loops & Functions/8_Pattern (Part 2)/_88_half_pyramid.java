/*
    INVERTED & ROTATED HALF-PYRAMID

    Step 1 : print space + star +space 

    Step 2 : 

          *     line = 1 , no of space = 3 , no of character = 1 
        * *     line = 2 , no of space = 2 , no of character = 2
      * * *     line = 3 , no of space = 1 , no of character = 3 
    * * * *     line = 4 , no of space = 0 , no of character = 4
    
    Step 3 : print nextline 

 */

public class _88_half_pyramid{
    public static void halfpyramid(int n){
        int line = 1 ;
        while (line <= n ) {
            //print spaces 
            for (int i = 1; i <= n-line ; i++) {
                System.out.print("  ");                
            }
            //print star 
            for (int i = 1; i <= line; i++) {
                System.out.print("* ");
            }
            System.out.println();
            line ++;
        }
    }
    public static void main(String[] args) {
        halfpyramid(7);
    }
}