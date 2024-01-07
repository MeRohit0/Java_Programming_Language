/*
assignment operator 

=   assign
+=  increment and then assign ----> x += 10 means (or x = x + 10 )
-=  decrease and then assign
*=  multiply and then assign 
/=  divide and then assign
%=  modulo and then assign


 */
public class _23_assignment {
    public static void main(String args[]){
        int a = 49;
        System.out.println("The assignment operator a :"+a);

        a += 43;
        System.out.println("The increment and assign operator : "+a);
        
        a -= 17;
        System.out.println("The decrement and assign operator : "+a);
        
        a *= 10;
        System.out.println("The multiply and assign operator : "+a);
        
        a /= 17;
        System.out.println("The divide and assign operator : "+a);
        
        a %= 17;
        System.out.println("The modulo and assign operator : "+a);
        
    }
}