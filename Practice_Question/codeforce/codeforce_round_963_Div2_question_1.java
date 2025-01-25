package Practice_Question.codeforce;

import java.util.Scanner;

public class codeforce_round_963_Div2_question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){

            int n = sc.nextInt();
            String str = sc.next();
            
            int ans[] = new int[4];
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'A'){ans[0]++;}
                else if(str.charAt(i) == 'B'){ans[1]++;}
                else if(str.charAt(i) == 'C'){ans[2]++;}
                else if(str.charAt(i) == 'D'){ans[3]++;}
                else{continue;}
            }
            int sum = 0 ; 
            for (int i = 0; i < ans.length; i++) {
                if(ans[i] > n ){
                    sum +=n;
                }else{
                    sum += ans[i];
                }
            }
            System.out.println(sum);
            
        }
        sc.close();
    }
}
