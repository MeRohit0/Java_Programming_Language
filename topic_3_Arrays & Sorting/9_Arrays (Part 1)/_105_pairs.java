/*
    pairs in array  using nested loop 

    input --> arr [1,3,5,7,9]
    output -->
    (1,3),(1,5),(1,7),(1,9),
    (3,5),(3,7),(3,9),
    (5,7),(5,9),
    (7,9)

    Time complexity is O(n^2) n square 
    space complexity is O(n)

 */
public class _105_pairs {
    public static void pairs(int array[]){
        int totalPairs = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++ ){
                System.out.print("( " + array[i] + " , " + array[j] + " ), ");
                totalPairs ++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is : " + totalPairs);
    }
    public static void main (String args[]){
        int number[] = { 1, 3, 5 , 7, 8, 9};
        pairs(number);

    }
}
