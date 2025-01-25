package Practice_Question.codeforce;


import java.util.Scanner;

public class codeforce_pinelyRound_div_Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t--> 0){
		    
            int n = sc.nextInt();
		    int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }

            boolean zero = false ;
            String str = "";
            int i = 0 ;
            for (i = 0; i < 40; i++) {
                //calculate avg
                int avg = 0 ; 
                for (int j = 0; j < arr.length; j++) {
                    avg += arr[j];
                }
                avg = avg / n ;

                if(avg == 0){
                    zero = true;
                    break;
                }
                str = str +" "+avg;
                //subtract 
                for (int k = 0; k < arr.length; k++) {
                    arr[k] = Math.abs(arr[k] - avg); 
                }

            }
            
            if(zero == true){
                if(str.length() > 0)
                str = str.substring(1);
                System.out.println(i);
                System.out.println(str);
            }else{
                System.out.println(-1);
            }

            }   
            sc.close();
    }
}
