/*
    Question 4 : Determine if 2 Strings are anagrams of each other.

What are anagrams?
    If two strings contain the same characters but in a different order, they can be said to be
    anagrams. Consider race and care. In this case, race's characters can be formed into a study, 
    or care's characters can be formed into race. Below is a java program to check if two strings
    are anagrams or not.

*/
public class _140_String_Question4 {
public static void main(String args[]) {
    String str1 = "race";
    String str2 = "care";
    //create array 
    int array1[] = new int[26];
    int array2[] = new int[26];

    for(int i = 0 ; i < str1.length() ; i++ ){
        //array for first string 
        int value1 = str1.charAt(i);
        array1[value1%26]++;
        //array for second string 
        int value2 = str2.charAt(i);
        array2[value2%26]++;
    }
    for(int i = 0 ; i < str2.length() ; i++ ){
        //array for second string 
        int value2 = str2.charAt(i);
        array2[value2%26]++;
    }
    boolean anagram = true;
    for(int i = 0 ; i < array1.length ; i++){
        if(array1[i] != array2[i]){
            anagram = false;
        }
    }

    System.out.println((anagram == true)?"YES":"NO");
}   
}
