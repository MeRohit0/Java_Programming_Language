/*
    print star pattern 
    nested loop concept is used here
    
    pattern

    *
    **
    ***
    ****

    Algorithm for mainly all patern problem 
    
    step 1  :   line (4)
            :   outer loop -> 4 times
    
    step 2  :   number of times symbol is printed in each line  
            :   inner loop  ->  i times
    
    step 3  :   what to print ?
            :   '*'
    
    step 4  :    print next line 

*/

public class _64_star_pattern {
    public static void main(String[] args) {
        
        //outer loop
        for(  int line = 1 ; line <= 4 ;  line ++   ){

            //inner loop 
            for(  int star = 1 ;  star <= line   ; star ++  ){

                //print * 
                System.out.print("*");
            }

            //next line after every line
            System.out.println();

        }

    }
}
