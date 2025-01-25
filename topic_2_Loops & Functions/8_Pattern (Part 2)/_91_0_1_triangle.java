/*
    0-1 Triangle pattern

    we use matrix to solve this question i.e.
        (row + coloum ) % 2 == 0 
        is even then print 1 
        otherwise print 0 


    1
    0 1 
    1 0 1 
    0 1 0 1
    1 0 1 0 1

 */
public class _91_0_1_triangle {

    public static void zero_one_triangle(int n) {
        int line = 1;
        while (line <= n) {
            for (int i = 1; i <= line; i++) {
                if ((line+i) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }

            System.out.println();
            line++;
        }
    }

    public static void main(String args[]) {
        System.out.println("hello main ");
        zero_one_triangle(5);
    }

}