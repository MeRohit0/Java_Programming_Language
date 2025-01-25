/*
    Program to remove the duplicates in a string 
        "appnnacollege"
    
    approach -  1. we will traverse the string form 0th index to length 
                2. check element at i th index is already present in boolean arr[26]
                        if true we will not add in newstring 
                        else we will add in newstring
                3.  check on next index 
                4.  return the string 

 */
public class _174_Remove_Duplicates_In_String {

    public static StringBuilder removeString(String str , int index , StringBuilder newString , boolean arr[] ){
        //base condition
        // ( point 1 )
        if(index == str.length()){
            return newString;
        }
        //working
        char character = str.charAt(index) ;
            //check element present ( point 2 )
        if( arr[character - 'a'] != true ){                 //  check this approach for [character - 'a'] it means 
            newString.append(character);                        //character integer value - 'a'a charecter lowercase value
            arr[character - 'a'] = true ;
        }
            // check on next index ( point 3 ) and ( point 4 )
        return removeString(str, index + 1 , newString, arr);

    }

    public static void main (String args[]){
        String str = "appnacollege";
        System.out.println(str + " Removed duplicate character in String is : " + removeString(str , 0 , new StringBuilder() , new boolean[26]));
    }
    
}
