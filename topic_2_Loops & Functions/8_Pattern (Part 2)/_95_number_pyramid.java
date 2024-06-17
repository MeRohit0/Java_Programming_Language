/*
    NUMBER PYRAMID pattern
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5 

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
