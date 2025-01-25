/*
    Program to convert the letter to uppercase 
    
        Time complexity -- > O ( n ) 
    
    Character.toUpperCase() function is used to convert the char to uppercase 
        
        Character.toUpperCase(input argument)
        in this we 
        input argument  -  the lowercase character
        return  - get uppercase character

 */
public class _136_uppercase {

    public static String toUppercase(String str ){
        // StringBuilder variable
        StringBuilder sb = new StringBuilder();

        //first letter is capital and insert into StringBuilder
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ' && i+1 < str.length() ){
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString() ;
    }
    public static void main(String args[]){
        String str = "hi, i am rohit";
        System.out.println(toUppercase(str));
    }
}
