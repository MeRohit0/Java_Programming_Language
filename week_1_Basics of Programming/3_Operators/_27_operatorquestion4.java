/*  
    1. check operator precedence  
    2. check the associativity left to right or right to left in case of same level

*/
public class _27_operatorquestion4 {
    public static void main(String[] args) {
        
        int x = 9, y =12;
        int a = 2 ,b = 4 , c = 6;
        int exp= 4/3 * (x + 34) + 9 *(a + b * c) + (3 + y * (2 + a)) / (a + b * y) ;
        System.out.println(exp);
    
    }
}
