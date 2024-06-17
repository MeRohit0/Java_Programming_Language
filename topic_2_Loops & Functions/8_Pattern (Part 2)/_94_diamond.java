/*

    important question ----> see if-else-if in loop line no :33 

    diamond pattern  n = 4

        *           i = 1   ,  space = 3    ,     star = 1      ,     space2 = 3
       ***          i = 2   ,  space = 2    ,     star = 3      ,     space2 = 2
      *****         i = 3   ,  space = 1    ,     star = 5      ,     space2 = 1
     *******        i = 4   ,  space = 0    ,     star = 7      ,     space2 = 0
     *******        i = 5   ,  space = 0    ,     star = 7      ,     space2 = 0
      *****         i = 6   ,  space = 1    ,     star = 5      ,     space2 = 1
       ***          i = 7   ,  space = 2    ,     star = 3      ,     space2 = 2
        *           i = 8   ,  space = 3    ,     star = 1      ,     space2 = 3
 */

class _94_diamond{
    public static void diamond(int n ){
        int star = 1 ;
        int space = n - 1;
        // space + star

        for (int i = 1 ; i <= n * 2   ; i++ ){
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i < 4){
                // first half
                star = star + 2 ;
                space --;
            }else if(i > 4){
                //second half 
                star = star - 2;
                space++ ;
            }
        }
    } 
    public static void main(String args[]){
        diamond(4);
    }
}