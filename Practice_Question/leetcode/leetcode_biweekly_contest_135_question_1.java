/*
        ✅  Accepted  ✅
 */
package Practice_Question.leetcode;

public class leetcode_biweekly_contest_135_question_1 {

    static public String losingPlayer(int x, int y) {
        int p1 = 0 , p2 = 0 ;
        while( x >=0 && y >= 0  ){
            if(x-1 >=0 && y-4 >= 0 ){
                p1++;
            }
            x -= 1 ;
            y -= 4 ;

            if(x-1 >=0 && y-4 >= 0 ){
                p2++;
            }
            x -= 1 ;
            y -= 4 ;
        }
        System.out.println(p1);
        System.out.println(p2);
        if(p1 > p2 ){
            return "Alice";
        }else{
            return "Bob";
        }
    }    
    public static void main(String[] args) {
        System.out.println(losingPlayer(4, 11));
    }
}