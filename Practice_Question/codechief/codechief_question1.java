package Practice_Question.codechief;

import java.util.Scanner;

public class codechief_question1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0 ){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    String a = sc.nextLine();
		    String b = sc.nextLine();
            
            int min_value = Integer.MAX_VALUE;
            int value ;
		    for (int i = 0; i < n-m; i++) {
                value = 0 ;
                for(int j = i ; j < m ; j ++){
                    if((a.charAt(i)) != (b.charAt(j)  )){
                        value++;
                    }
                }
                min_value = Math.min(min_value, value);
            }
            System.out.println(min_value);

    }
}
}