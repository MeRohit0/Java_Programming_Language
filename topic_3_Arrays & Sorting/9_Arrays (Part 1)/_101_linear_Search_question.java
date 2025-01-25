/**
    linear_Search_question
 */
public class _101_linear_Search_question {

    public static int linearSearch(String arr[], String key){
        for(int i = 0 ; i < arr.length ; i++ ){
        if( arr[i] == key ){
            return i ;
        }
    }
    return -1;
}
public static void main(String args[]){
    String arr[] = {"dosa" , "cholla bhatura" , "samosa","sandwich","fruiti","coke"};
    String key = "samosa";
    int found = linearSearch(arr, key);
    if (found == -1 ) {
        System.out.println("Item is not found remember to check speelings and spaces also");        
    }
    else{
        System.out.println("Item Found at index : " + found );
    }
}    
}