/*
 print the character patter 

    A       line = 1 , no of character = 1 
    BC      line = 2 , no of character = 2
    DEF     line = 3 , no of character = 3 
    GHIJ    line = 4 , no of character = 4

    step 1 :    outer loop 
                no of line n = 4
                
    step 2 :    inner loop 
                no of character is = j <= line
    
    step 3 :    print character 
                using character varaible which scope is outside 

    step 4 :    print next line 

 */
public class _67_character_patterm {
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';
        for( int  line = 1 ; line <= n ; line ++   ){

            for( int j = 1 ; j <= line ;j ++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
