/*
    trapping rainwater problem using ( helper array or auxiliary array )

    time complexity is O(n)
 */

public class _110_trapping_railwater {
    
    
    public static int trapRainwater(int height[]){
        
        int size = height.length;
        
        //calculate left max boundary -array 
        int leftmost[] = new int[size];
        
        leftmost[0] = height[0];

        for(int i = 1 ; i < size ; i ++){

            leftmost[i] = Math.max(leftmost[i-1] , height[i]);
        
        }
        
        
        
        //calculate right max boundary -array 
        int rightmost[] = new int[size];
        rightmost[size - 1 ] = height[size - 1 ] ;
        for (int i = size - 2; i >= 0 ; i--) {
            rightmost[i] = Math.max(height[i] , rightmost[i+1]);
        }
        
        

        //loop
        int trapwater = 0; 
        for (int i = 0; i < size ; i++) {

            //waterlevel = min (leftmost boundary , rightmost boundary)
            int waterlevel = Math.min(leftmost[i] , rightmost[i]);

            // trapwater = waterlevel - height[i]
            trapwater += waterlevel - height[i];
        }

        return trapwater ;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The trapwater value is : " + trapRainwater(height));
        
     }
}
