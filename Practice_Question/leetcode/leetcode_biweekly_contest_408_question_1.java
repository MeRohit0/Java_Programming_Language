package Practice_Question.leetcode;

public class leetcode_biweekly_contest_408_question_1 {
    public static int nonSpecialCount(int l, int r) {

        int special = 0 ;
        for(int i = l ; i <= r ; i ++ ){
                int count_divisor = 0 ;
            for(int j = 1 ; j < Math.sqrt(i) ; j++){
                if( i % j == 0  ){
                    count_divisor++;
                }
            }
            count_divisor *= 2 ;
            if(count_divisor == 2 ){
                special++;
            }
        }
        return r - l + 1 - special ;
    }
    public static void main (String arg[]){
        int l = 5;
        int r = 7;
        System.out.println(nonSpecialCount(l,r));
    }
}
