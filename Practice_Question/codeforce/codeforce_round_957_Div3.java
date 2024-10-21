package Practice_Question.codeforce;

import java.util.Scanner;
public class codeforce_round_957_Div3 {

    public static int min(int arr[] ){
        int min_num = Math.min(arr[0],arr[1]);
        min_num = Math.min(min_num , arr[2]);
        for(int i = 0 ; i < arr.length ; i++){
            if(min_num == arr[i]){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0 ){
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            int arr[] = {a,b,c};
            for(int i = 0 ; i < 5 ; i++){
                int min_index_value = min(arr);
                arr[min_index_value]++;
            }
            System.out.println(arr[0]*arr[1]*arr[2]);

        }
        sc.close();
    
    }    
}
