package Practice_Question.codechief;

import java.util.Scanner;

public class codingContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0 ){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    int total_income = x * y ;
		    int reduced = 0 ;
		    while(true){
		        if(total_income <= z ){
		            break;
		        }
		        else{
		            reduced++;
		            total_income = total_income - y;
		        }
		    }
		    System.out.println(reduced);
		    
        }
sc.close();
    }
}
