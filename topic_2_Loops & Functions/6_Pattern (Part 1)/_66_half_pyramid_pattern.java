/*
    half pyramid is print 

    
    step 1 : outer loop 
             n = 4 
             here line = n (here is n = 4 )
    
    step 2 : inner loop 
             no of iteration condition is : symbol <= line
  
    step 3 : print symbol (number )
                sop ()
    
    step 4 : print next line 


    1       line i = 1 , no of symbol = 1 
    12      line i = 2 , no of symbol = 2
    123     line i = 3 , no of symbol = 3
    1234    line i = 4 , no of symbol = 4

 */

public class _66_half_pyramid_pattern {
    public static void main(String[] args) {
        int n = 4 ;
        //outer loop 
        for (int line = 1 ; line <= n ; line ++  ){
            //inner loop for iteration    
            for(  int j = 1 ; j <= line ; j++  ){
                //for print numbers    
                    System.out.print(j);
                }
                //print next line 
            System.out.println();
        }
    }
}
