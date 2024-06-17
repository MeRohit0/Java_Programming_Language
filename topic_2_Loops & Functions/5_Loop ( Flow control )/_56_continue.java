/*
    Continue statement is use to skip an iteration 
    print the number from 1 to 5 but skip the 3 value 
 */
public class _56_continue {
    public static void main(String[] args) {
        for( int i = 1 ; i <= 5 ; i ++){
            if(i ==3 ){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("You have skip the 3 ");
    }
}
