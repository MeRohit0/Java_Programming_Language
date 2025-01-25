/*
    BUTTERFLY pattern 

    *             *     line = 1 ,       star = 1    , space = 6    , star = 1 
    * *         * *     line = 2 ,       star = 2    , space = 4    , star = 2 
    * * *     * * *     line = 3 ,       star = 3    , space = 2    , star = 3 
    * * * * * * * *     line = 4 ,       star = 4    , space = 0    , star = 4 
    * * * * * * * *     line = 5 ,       star = 4    , space = 0    , star = 4 
    * * *     * * *     line = 6 ,       star = 3    , space = 2    , star = 3 
    * *         * *     line = 7 ,       star = 2    , space = 4    , star = 2 
    *             *     line = 8 ,       star = 1    , space = 6    , star = 1 

 */
public class _92_butterfly {

    public static void butterfly(  int n ){
        int line = 1 ;
        int space =  2 * n - 2 ;
        int star = 1  ;
        while ( line <= 2*n){
                //print star 
                for (int i = 1; i <= star; i++) {
                    System.out.print("* ");
                }
                //print space
                for (int i = 1; i <= space  ; i++) {
                    System.out.print("  ");
                }
                //print star
                for (int i = 1; i <= star; i++) {
                    System.out.print("* ");
                }
                System.out.println();
 
                if (line < n) {
                    star ++  ;
                    space -= 2 ;
                } else if(line > n ) {
                    star -- ;
                    space += 2;
                }
                line ++ ;
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }
    
}
