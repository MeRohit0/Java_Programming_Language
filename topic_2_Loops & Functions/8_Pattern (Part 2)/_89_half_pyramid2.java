/*
    INVERTED HALF-PYRAMID with Numbers pattern
    
    Step 1 : print symbol form line number  to  n

    Step 2 : 

    1 2 3 4 5   line = 1  ,     total_number = 5    
    1 2 3 4     line = 2  ,     total_number = 4  
    1 2 3       line = 3  ,     total_number = 3  
    1 2         line = 4  ,     total_number = 2 
    1           line = 5  ,     total_number = 1  

    Step 3 : print nextline 

*/

public class _89_half_pyramid2 {
    public static void halfpyramid(int n){
        int line = 1 ;
        while (line <= n ) {
            
            for (int i = 1; i <= n - line + 1 ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            line ++;
        }
    }
    public static void main(String[] args) {
        halfpyramid(5);
    }
}