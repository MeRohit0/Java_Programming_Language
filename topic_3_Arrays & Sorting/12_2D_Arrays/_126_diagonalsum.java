/*
 * Program for the Diagnoal sum
    i.e sum of primary diagonal and secondary diagonal 

    1 st approach time complexity - O(n^2)
    2 nd approach time complexity - O(n)
 * 
*/

public class _126_diagonalsum {
    // time complexity - O(n^2)
public static void diagonalSum(int arr[][]){
    int sum = 0  ;
    boolean status = arr.length % 2 == 0 ? true :false  ;
    for(int i = 0 ; i < arr.length ; i ++){
        //sum of primary diagonal 
        sum += arr[i][i];
        for(int j = 0 ; j < arr.length ; j++){
            //sum secondary diagonal 
            if(i+j == arr.length - 1 ){
                sum += arr[i][j];
            }
        }
    }
    if(status == false){
        int half = arr.length /2 +1 ;
        sum -= arr[half][half];
    }

    System.out.println("Total sum of diagonal sum is : " + sum); 

    // time complexity - O(n)
    // 2 nd approch 
    int sum2  = 0;
    for(int i = 0 ; i < arr.length ; i++ ){
        //pd 
        sum2 += arr[i][i] ; 
        //sd                            simple maths sd condition --> i + j == n - 1   -->  i = n -1 - j
        if(i != arr.length - 1 - i )        //when i != j 
            sum2 += arr [i][ arr.length - 1 - i] ; 
    }
    System.out.println("Total sum of diagonal sum is : " + sum2);

}
    public static  void main(String args[]){
        int arr[][] = {{ 1, 2 ,3 , 4}, {5,6,7,8} , {9,10,11,12}, {13,14,15,16}};
        diagonalSum(arr);
    }
}
