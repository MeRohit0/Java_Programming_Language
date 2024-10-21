/*
    Program to find the next greater element 
    
    arr[] = { 3 ,10, 4, 2, 1, 2, 6, 1, 7, 2, 9 }
    nge[] = { 10,-1, 6, 6, 2, 6, 7, 7, 9, 9,-1}

    
    This problem has many variations 
        1. find next greater element 
        2. find next smallest element 
        3. find prevous greater element
        4.find previous smaller element

    Two method are 
    1. brute force method

        Time complexity - O(n ^ 2 )
        Space complexity - O(n)

        Approach - 
            1. select the one element from the ArrayList i
            2. select next element from the ArrayList 
            3. check if (first element < next element )
                        nge[i] = next element 
            4. if( second element > size )
                    nge[i] = -1 ;
            5. Do step 1 - 4 until the list is fully traversed 


    2. optimize method using stack

        Time complexity - O( n )
        Space complexity - O(n)

    Approach - 
        1. traverse from right to left from the ArrayList 
        2. loop for if ArrayList element is less than or equal to element form the arraylist then remove from the stack
        3. check for the empty stack if (true) we add -1 into nge[] arraylist 
            else add element into nge[i] in arraylist
        4. last push the element into the stack 



 */
import java.util.ArrayList;
import java.util.Stack;
public class _332_Next_Greater_Element {

    // bruteforce method 
    public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> list ){
        
        ArrayList<Integer> nge = new ArrayList<>();
        
        for(int i = 0 ; i < list.size(); i ++){
            int j ;
            for(j = i +1 ; j < list.size() ; j ++){
                if(list.get(i) < list.get(j)){
                    nge.add(list.get(j));
                    break ;
                }
            }
            if(j == list.size())    // if size is max 
                nge.add(-1);
        }

        return nge;
    }

    // optimize method using stack 
    public static ArrayList<Integer> nextGreaterElement2(ArrayList<Integer> list){
        
        ArrayList<Integer> nge = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for( int i = list.size()-1 ; i >= 0 ; i --){    //1. traverse from right to left 
            
            while( !stack.isEmpty() && stack.peek() <= list.get(i) ){   
                stack.pop();                    //2. <= element are all removed from stack
            }
            if(stack.isEmpty()){                // 3. check for empty list if true add -1  else false add element into list
                nge.addFirst(-1) ;                  
            }else{                              
                nge.addFirst(stack.peek());     // we have use the addFirst because 
                                                // we are traversing form right to left in main list 
            }
            stack.push(list.get(i));            // 4. push the element into stack 
        }
        return nge;

    }
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(10);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(9);


        // ArrayList<Integer> nge = nextGreaterElement(list);
        // System.out.println("Array "+list);
        // System.out.println("Next Greater element"+nge);

        ArrayList<Integer> list2 = new ArrayList<>();
        
        list2.add(4);
        list2.add(12);
        list2.add(5);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        
        ArrayList<Integer> nge2 = nextGreaterElement2(list2);
        System.out.println("Next Greater element"+nge2);
    }
}
