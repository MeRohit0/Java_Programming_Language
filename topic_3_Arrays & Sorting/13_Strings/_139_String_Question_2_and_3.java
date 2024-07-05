/*
    Question 2 and 3 What will be the output of the following code?

*/
public class _139_String_Question_2_and_3 {

    public static void question2(){
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2) );
    }
    public static void question3(){ 
        
        String str = "ApnaCollege".replace("l","");
        System.out.println(str);
    }
    public static void main (String args[]){
        question2();
        question3();
        
    }
}
