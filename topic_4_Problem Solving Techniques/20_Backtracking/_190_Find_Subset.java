/*
    
    Program to find the subset of string 
    str = {abc};
    null,abc,ab,ac,a,bc,b,c
    
    Approach - 
    we have 2 option take it and add to new String or
        don't take it and continue 

        thats why Time Complexity -  O(2 ^ n);

 */
public class _190_Find_Subset {
    public static void  findSubset(String str , String nstr , int index ){
        //base case 
        if(index == str.length()){
            if(nstr.length() == 0 ){
                System.out.println("{}");
            }
            else{
                System.out.println(nstr);
            }
            return ;
        }

        //working

        //take 
        findSubset(str, nstr + str.charAt(index) , index+ 1 );
        //not take 
        findSubset(str , nstr , index+1);       // this is backtracking 
    }
    public static void main(String args[]){
        String str1 = "abc";
        findSubset(str1, "", 0);

    }
}
