/*
    Program to calculate the container with most water
        for given n lines on x-axis , use 2 lines to form a container such that it holds maximum water
    [1,8,6,2,5,4,8,3,7]

    Approach - 
    
    1 . Bruteforce method 

        In this we pick the i'th line and j'th line and we calculate the area between there two line 
        and check with global variable to find max value 

        time complexity - O(n ^ 2 )
        space complexity - O(1)

    2 . Two pointer method 

        In this we use two pointer one at starting and other at ending index 
            we will calculate the area and compare with global variable 
            we will move that pointer which is smaller then other pointer 

        Time complexity - O(n )
        space complexity - O(1)


 */
import java.util.ArrayList;
public class _207_Container_With_Most_Water {

    //brute force method 
    public static void storeWater(ArrayList<Integer> height){
        //max value 
        int maxArea = Integer.MIN_VALUE ;
        
        //find length and width
        for(int i = 0 ; i < height.size(); i ++){
            for(int j = i + 1 ; j < height.size(); j++ ){
                
                int length = Math.min(height.get(i) , height.get(j));
                int width = j - i ; 
                int area = length * width;
                //max area is calculated 
                maxArea = Math.max(maxArea , area);

            }
        }
        System.out.println(maxArea);
    }
    
    //using Two pointer method 
    public static void storeWater2(ArrayList<Integer> height ){
        
        int maxArea = 0;
        
        //starting and ending pointer 
        int strp = 0 , endp = height.size() - 1 ;

        while(strp < endp){

            int length = Math.min(height.get(strp),height.get(endp));
            int width = endp - strp;
            int area = length * width ; 
            
            maxArea = Math.max( maxArea, area );
            
            // next iteration increment or decrement depends 
            if(strp > endp ){       
                endp -- ;
            }else{
                strp ++ ;
            }
        }
        System.out.println(maxArea);

    }
    public static void main(String args[]){
        
        ArrayList <Integer> height = new ArrayList<>();
        //insert the element into arraylist
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //brute force method 
        storeWater(height);

        //two pointer method 
        storeWater2(height);

    }
}
