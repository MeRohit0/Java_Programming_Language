/*
    Question 3:
    You  are  given  an  array prices where prices[i] is the price of a 
    given  stock  on  the ith day.Return the maximum profit you can achieve from 
    this transaction. If you cannot achieve any profit, return 0.

    time complexity - O(n)
    space complexity - O(1)
 */
public class _114_arrays_question3 {
    public static int maxprofit(int arr[]){
        int maxprofit = 0 ;
        int buyprice = Integer.MAX_VALUE;

        for( int i = 0 ; i < arr.length ; i ++  ){
            if( arr[i] < buyprice ){
                buyprice = arr[i];
            }else{
                int profit = arr[i] - buyprice ; 
                maxprofit = Math.max(profit , maxprofit);
            }
        }
        return maxprofit;
    }
    public static void main (String args[]){
        int price[] = {7, 6, 4,  3, 1};
        System.out.println("Maximum Profit is : " + maxprofit(price));
    }
}
