/*
    StringBuilder is used to store the string data and it is much more flexible then string 
        it does not copy the entire string unlike string  
        and we can use all string funtion 

    SYNTAX : 
    StringBuilder name = new StringBuilder();

    NOTE : you can convert the stringbuilder to string using function 
            toString()  --  it  can convert any object to string like 
    
                Integer a = 5; 
                Character ch = "a";
                a.toString() ; // this will give a = "5"; ch = "a";
                ch.toString  ;

 */
public class _135_StringBuilderd {
    public static void main(String arg[]){

        /*
            this is very costly operation as we have to copy each time in String data type 
            to create new string 
            it time complexity is O ( 26 * n ^ 2 ) --> O(n ^ 2)
        */ 
        String str = "Tony";
        System.out.println(str);
        for (char c = 'a'; c <= 'z'; c++) {
            str += c ;
        }
        System.out.println(str);

        //stringbuilder 
        // time complexity is O(n)
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z' ; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));

    }
}
