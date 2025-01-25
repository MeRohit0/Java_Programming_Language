/*
    understand the break statement in the loop 
    it is used to exit the current iterating loop 
    print the number form 1 to 5 but exit the loop at value 3 
*/
public class _54_break {
    public static void main(String arg[]){

        for(int i =1 ; i <= 5 ; i ++ ){
            if(i == 3 ){
                break;
            }
            System.out.println(i);    
        }
        System.out.println("We have exit the loop using break ");
    }
}
