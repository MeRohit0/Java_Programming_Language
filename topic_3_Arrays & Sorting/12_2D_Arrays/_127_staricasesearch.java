/*
    Program for the search in the sorted matrix 
    
    {{10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,50}};

    time complexity is --- > O ( n + m )
                            here    n is row 
                                    m is coloumn


*/

public class _127_staricasesearch {

    public static boolean staircase(int arr[][] , int key ){

        // here starting point is 40 
        int row = 0 ; int col = arr[0].length - 1;

        while(row < arr.length  && col >= 0 ){

            if(  arr[row][col] == key ){
                System.out.println("We found the element at index ( " + row + " , " + col + " )");
                return true;
            }
            else if (arr[row][col] > key ){
                col -- ;
            }
            else{
                row++;
            }
            
        }
        System.out.println("Element is not present ");
        return false;

    }
    public static boolean staricase_2nd_point(int arr[][], int key){
        // here starting point is 32 

        int row = arr.length - 1  ; int col = 0;
        //initialization of while loop
        while( row >= 0 && col < arr[0].length ){

            // found 
            if( arr[row][col] == key ){
                System.out.println("We found the element "+key+ " at index ( " + row + " , " + col + " )");
                return true;
            }
            else if (arr[row][col] > key ){
                row--;
            }
            else{
                col++ ;
            }
        }
        System.out.println("Element "+ key +" is not present");
        return false;
    } 
    public static void main(String args[]){

        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        int key = 20;
        System.out.println("1 st method ");
        staircase(matrix, key);
        System.out.println("2 nd method ");
        staricase_2nd_point(matrix, key);
        
    }
}
