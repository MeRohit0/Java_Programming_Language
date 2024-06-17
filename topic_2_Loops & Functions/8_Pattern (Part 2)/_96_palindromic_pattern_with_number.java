/*
    PALINDROMIC Pattern with Numbers pattern
        1
       212
      32123
     4321234
    543212345
 */

public class _96_palindromic_pattern_with_number {
public static void palindromic_pattern( int n ){
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
