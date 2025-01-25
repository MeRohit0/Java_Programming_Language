package Practice_Question.codeforce;

import java.util.Scanner;

public class codeforce_round_962_Div3_quesB {

    public static void scale(String arr[] , int n , int k ){
        for (int i = 0; i < n/k; i++) {
            for (int j = 0; j < n/k; j++) {
                System.out.print(arr[i*k].charAt(j*k));
            }System.out.println();
        }
    }
    // [0,1,2,3,4,5]
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0 ){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String arr[] = new String[n];

            //array initialized 
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }

            scale(arr, n, k);

        }
        sc.close();
    }
}
