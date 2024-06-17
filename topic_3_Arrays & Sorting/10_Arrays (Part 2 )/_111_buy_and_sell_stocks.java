/*
    Best time buy and sell stocks 
 */
public class _111_buy_and_sell_stocks {
    
    public static int buy_sell_stocks(int price[]){
        
        //find minimum buy price 
        int buyprice = Integer.MAX_VALUE ; 
        int maxprofit = 0;

        //check the value of buy with everyday

        for(  int i = 0 ; i < price.length ; i++  ){

            if (buyprice > price[i]) {
                buyprice = price[i];
            }else{
                int profit = price[i] - buyprice ;
                maxprofit =  Math.max(profit , maxprofit);
            }
        }
        return maxprofit ; 
    }
    public static void main(String[] args) {
        int dayprice[] =  { 7, 1 , 5 , 3 , 6 , 4 };
        System.out.println("Maximum profit is : "+ buy_sell_stocks(dayprice));
    }
}
