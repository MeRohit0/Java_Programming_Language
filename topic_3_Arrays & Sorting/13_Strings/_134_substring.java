/*

Program for printing substring 

    substring() function is used to get the sub string from start to end index (end index is excluded )
        
    Syntax : substring(starting index , ending index);

Program for print the largest string accourding to lexicographic manner 
    i.e. a < b < z dictionary

        compareTo()  and compareToignorecase() are use compare the contents of string in dictionry manner
        
        str1.compareTo(str2);
        here, it gives   0 : equal 
                        <0 : str1 < str2 
                        >0 : str1 > str2

    // time complexity of compareTo() - O(x * n)
    //                                  here x is length of string 
        
    
*/
public class _134_substring {
    
    public static String substring(String str , int start_index , int end_index){
        String substr = "";
        for(int i = start_index ; i < end_index ; i ++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){

        //substring function user define and inbuild
        String str3 = "HelloWorld";
        System.out.println("print substring: "+substring(str3, 0, 5));

        //using inbuild function is same 
        System.out.println(str3.substring(0,6));

        //print the largest string accourding to lexicographic manner

        // time complexity of compareTo() - O(x * n)
        //                                  here x is length of string 

        String fruits[] = {"apple", "mango" , "banana" };

        String largest = fruits[0];

        for(int i = 1 ; i < fruits.length ; i ++){
            if( largest.compareTo(fruits[i]) < 0  ){
                largest = fruits[i];
            }
        }

        System.out.println("Largest integer is : " + largest);

    }
}
