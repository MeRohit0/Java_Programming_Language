/*
print reverse of a number 
input 12345  --->  output 54321
 */

public class _51_print_reverse_of_num {
    public static void main(String args[]){
        int number = 1425232;
        while(number > 0){
            int lastdigit = number % 10;
            System.out.print(lastdigit);
            number /=10;
        }

    }
}
