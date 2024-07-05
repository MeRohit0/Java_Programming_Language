/*
    PALINDROMIC Pattern with Numbers pattern
        1           line = 1  ,  space = 4 , symbol = 1
       212          line = 2  ,  space = 3 , symbol = 3
      32123         line = 3  ,  space = 2 , symbol = 5
     4321234        line = 4  ,  space = 1 , symbol = 7
    543212345       line = 5  ,  space = 0 , symbol = 9
 */

public class _96_palindromic_pattern_with_number {
public static void palindromic_pattern( int n ){
    //line 
for (int line = 1; line <= n; line++) {
    //space
    for (int i = 1; i <=n - line; i++) {
        System.out.print(" ");
    }
    //number 
     for(int i = line ; i > 1 ; i-- ){
        System.out.print(i);
    }
    for(int i = 1 ; i <= line ; i++){
        System.out.print(i);
    }
    System.out.println();
    
}
}
public static void main(String args[]){
    palindromic_pattern(5);
}
    
}
