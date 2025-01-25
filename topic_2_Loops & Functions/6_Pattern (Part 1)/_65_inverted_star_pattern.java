/*
    here we are print inverted star pattern 
    
    step 1 : no of line  = n (here n = 4 ) 

    step 2 : inner loop = n - i + 1

    step 3 : sop = '*';

    step 4 : print nextline;

    ****    star = 4 , line no ( here i ) = 1  
    ***     star = 3 , line no ( here i ) = 2 
    **      star = 2 , line no ( here i ) = 3
    *       star = 1 , line no ( here i ) = 4 

 */

public class _65_inverted_star_pattern {
    public static void main(String[] args){
        int n = 4;

        //outer loop for no of line its should print 
        for( int i = 1 ; i <= n ; i++    ){

            // inner loop for no of times its iterate 
            for(int star = 1 ; star <= n-i+1 ; star++){
                // print star 
                System.out.print('*');
            }
            // print next line 
            System.out.println();
        }
    }    
}
