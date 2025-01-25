/*
    FLOYD'S Triangle pattern

    1 
    2  3
    4  5  6
    7  8  9  10
    11  12  13  14  15     

 */
public class _90_floyad_triangle {
    public static void floydtriangle(int n){
        int line = 1 ;
        int number = 1;
        while (line <= n ) {
            
            for (int i = 1; i <= line; i++) {
                
                System.out.print("  "+number + "  ");
                number ++ ;
            }
            System.out.println();
            line ++;
        }
    }
    public static void main(String[] args) {
        floydtriangle(5);
    }
}