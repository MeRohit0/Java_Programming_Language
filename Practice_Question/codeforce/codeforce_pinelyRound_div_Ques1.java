package Practice_Question.codeforce;

import java.util.Scanner;

public class codeforce_pinelyRound_div_Ques1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0){
		    
            int n = sc.nextInt();
		    int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            int max = 0 ; 
            for (int i = 0; i < arr.length; i+= 2) {
                max =Math.max(arr[i] , max);
            }
            System.out.println(max);
		}
        sc.close();
    }
}
