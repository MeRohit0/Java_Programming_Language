/*
    Program to String Compression     
        "aaabbcccdd"  - >  "a3b2c3d2"


    LOOK AT while loop at line number 15 ( It is also using the same i variable ) 
        therefore no using the separete variable will result in 
        time complexity --> O(n)

 */
public class _137_compression {

    public static String compressionIntoString(String str){
        
        String newstr = "";
        for(int i = 0 ; i < str.length() ; i++){
            Integer count = 1 ;

            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1) ){
                count++ ; 
                i++;
            }
            //add character 
            newstr += str.charAt(i);
            //add number of time 
            if (count > 1 ){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static String compressIntoStringBuider(String str ){
        
        StringBuilder sb = new StringBuilder();
        //traverse on each item
        for(int i = 0 ; i < str.length() ; i ++){
            Integer count = 1;
            while ( i < str.length() - 1  && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            //add character
            sb.append(str.charAt(i));
            //add number of time 
            if(count > 1 ){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        String str2 = "abc";
        System.out.println(compressionIntoString(str));
        System.out.println(compressIntoStringBuider(str));
        System.out.println(compressionIntoString(str2));
        System.out.println(compressIntoStringBuider(str2));
    }
}
