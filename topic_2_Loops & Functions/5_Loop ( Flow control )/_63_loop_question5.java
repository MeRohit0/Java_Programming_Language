/*
    in this question ( scope of variable is important )

    Scope of variable is limited to local if the for loop block has declared 
    variable i inside of for loop not in the main function 

    i have change the scope of the variable i from for loop to main because 
    this will give complilation error 
 */
public class _63_loop_question5 {
    public static void main(String[] args) {
        int i = 57;
        System.out.println("Value of i in main is : " + i );
        for(  i = 0 ; i <= 5 ; i++  ){
            System.out.println("Value inside of i in for block is : "+i);
        }
        // this i variable is access by both block  
        System.out.println("Value of i in main is : " + i );
    }
}
