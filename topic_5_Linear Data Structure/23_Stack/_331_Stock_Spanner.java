/*
    Program for stock span problem 

        The span pf stock's price is the maximum number of consecutive days which is less than or 
        equal to current day price 
        given arr =  [100,80,60,70,60,75,85]
        output = [1,1,1,2,1,4,6]
    

    2 Methods are - 

    brute force method 
        Time Complexity - O(n ^ 2 )
        Space Complexity - O(n)

        Approach -  select the element from 0 to n in array
                        go through all backward elements to find the span value and assign 
                    

    optimized approach using stack 
        Time Complexity - O(n) 
        Space Complexity - O(n)

        Approach - 
            1. initalize the empty stack , span ArrayList  
            2. push the first element index into stack and 
                span[0] = 1 ;
                go for loop ( i = 1 to n ) 
                    if current price is less then pop() from stack 
                if stack.isEmpty()
                    span[i] = i +1 ;
                else 
                    span[i] = i - previousHighValue
            3. push the stack with current index 



 */
import java.util.ArrayList;
import java.util.Stack;
public class _331_Stock_Spanner {
    
    // brute force method 
    // Time complexity -O(n^2)
    // Space Complexity - O(n)
    ArrayList<Integer> list = new ArrayList<>();

    public void stockSpanner(ArrayList<Integer> list2 ){
        int i = 0 ; 
        while(i < list2.size()){
            int val = 0 ; 
            int curr = list2.get(i);
            if(i == 0 ){
                list.add(1);
            }
            for(int j = i ; j >= 0 ; j -- ){
                if(list2.get(j) <= curr ){
                    val ++;
                }
                else{
                    list.add(val);
                    break;
                }
            }
            i++;
        }

    }

    // optimized approach using stack
    // time complexity - O(n)
    // space complexity = O(n)
    
    public ArrayList<Integer> stockSpanner2(ArrayList<Integer> stocks){

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> span = new ArrayList<Integer>();
        span.add(1) ;
        s.push(0);
        
        for(int i = 1 ; i < stocks.size(); i++){
            int currPrice = stocks.get(i);
            while(!s.isEmpty() && currPrice > stocks.get(s.peek()) ){
                s.pop();
            }
            if(s.isEmpty()){
                span.add(i+1);
            }
            else{
                int prevHigh = s.peek();
                span.add (i - prevHigh);
            }
            s.push(i);
        }
        return span ;
    }

    public static void main(String[] args) {
        
        // brute force method Time complexity -O(n^2)
        _331_Stock_Spanner span = new _331_Stock_Spanner();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(80);
        list.add(60);
        list.add(70);
        list.add(60);
        list.add(75);
        list.add(85);

        span.stockSpanner(list);

        System.out.println(list);
        System.out.println(span.list);

        // optimized approach 
        ArrayList<Integer> ans = span.stockSpanner2(list);
        System.out.println(ans);
        

    }
}
