/*
    hollow rhombus ( n = 5 )

    note : has spaces + hollow rectangle 


        * * * * *      line = 1    space = 4 , star = 5 , space = 0 , star = 0 
       *       *       line = 2    space = 3 , star = 1 , space = 7 , star = 1 
      *       *        line = 3    space = 2 , star = 1 , space = 7 , star = 1 
     *       *         line = 4    space = 1 , star = 1 , space = 7 , star = 1 
    * * * * *          line = 5    space = 0 , star = 5 , space = 0 , star = 0 
    
 */
public class _93_hollow_rhombus {
    public static void hollow_rhombus(int n ){
        int line = 1 ;
        while (line <= n ) {
            //print space
            for (int i = 1; i <= n - line  ; i++) {
                System.out.print(" ");
            }
            //print star 
            if (line == 1 || line == n ){
                for(  int i = 1 ; i <= n ; i ++  ){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
            }
            //print space 
            for (int i = 1; i <= n - 2 ; i++) {
                System.out.print(" ");
            }
            //print star 
            if((line != 1) && (line != n) ){
                System.out.print("*");
            }
            
            //print line 
            System.out.println();
            
            line ++ ; 
        }
    }
    public static void main(String args[]){
        // hollow_rhombus(5);
        hollow_rhombus(7);
    }
}    
