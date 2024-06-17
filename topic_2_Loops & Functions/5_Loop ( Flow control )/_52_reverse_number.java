/*
    reverse the number like 
    int a = 539;
    int rev_of_a = 935;
    and we store that value in another variable and we can use it also 
 */
public class _52_reverse_number {
    public static void main(String[] args) {
        int number = 5379543;
        int rev_number  = 0;

        while(  number > 0 ) {
            int temp = number%10;
            rev_number = rev_number*10 + temp;
            number /= 10;

        }
        System.out.println("The reverse number is :" + rev_number);
    }
}
