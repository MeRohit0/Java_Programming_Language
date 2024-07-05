/*
    NUMBER PYRAMID pattern
        1                   line = 1  ,  space = 4 , symbol = 1 , total_symbol = 1
       2 2                  line = 2  ,  space = 3 , symbol = 2 , total_symbol = 3
      3 3 3                 line = 3  ,  space = 2 , symbol = 3 , total_symbol = 5
     4 4 4 4                line = 4  ,  space = 1 , symbol = 4 , total_symbol = 7
    5 5 5 5 5               line = 5  ,  space = 0 , symbol = 5 , total_symbol = 9

 */
public class _95_number_pyramid {
    public static void number_pyramid(int n ){
        
        for (int line = 1 ; line <= n; line++) {
            //space 
            for(int i = 1 ; i <= n - line ; i++){
                System.out.print(" ");
            }
            //symbol 
            for(int i = 1 ; i <= ((line * 2) - 1) ; i ++ ){
                if ( i%2 == 0 ) {
                    System.out.print(" ");
                }else{
                    System.out.print(line);
                }
            }
            System.out.println();
            
        }
    }
    public static void main (String args[]){
        number_pyramid(5);
    }
}
