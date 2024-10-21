/*
    
    Alice and Bob are playing a game in an array a of size n.

    They take turns to do operations, with Alice starting first. 
    he player who can not operate will lose. At first, a variable mx is set to 0.

    In one operation, a player can do:

    Choose an index i(1≤i≤n ) such that ai≥mx and set mx to ai. Then, set ai to 0.

    Determine whether Alice has a winning strategy.

 */
package Practice_Question.codeforce;

import java.util.Scanner;

public class codeforce_question1_contest_960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0 ){

            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int mx = 0 ;
            int p1 = 0 ; 
            int p2 = 0 ;
            for(int i = 0 ; i < a.length-1 ; i++){
                if( a[i] >= mx){
                    mx = a[i];
                    a[i] = 0 ;
                    p1++;
                }
                else {break;}
                i++;
                if(a[i] >= mx){
                    mx = a[i];
                    a[i] = 0;
                    p2++;
                }else{
                    break;
                }
            }
            System.out.println(p1 + " "+ p2);

            if(p1 > p2 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }

    
}
