package Practice_Question.codeforce;

import java.util.Scanner;

public class codeforce_round_962_Div3_quesA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ){
            int n = sc.nextInt();
            int chicken = 0 ; 
            int i = 0 ;
            for(i = 0 ; i < n ; i += 2){
                chicken ++;
            }

            int cow = 0 ; 
            for(i = 0 ; i < n ; i += 4){
                cow ++;
            }
            if(i<n){
                cow++;
            }
            System.out.println(Math.min(cow , chicken));

        }
        sc.close();
    }
}
