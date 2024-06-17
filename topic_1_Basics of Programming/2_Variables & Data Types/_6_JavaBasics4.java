/*  Types of datatypes in java 
primitive(Exist)      and     non-primitive (user define)
        Size (byte)

byte      1byte                      String
short     2byte                      Array
char      2byte                      Class
boolean   1bit (true or flase)       Object
int       4byte                      Interface
float     4byte                      
long      8byte
double    8byte

*/
public class _6_JavaBasics4 {
    public static void main(String args[]){
        byte a = 5;
        System.out.println(a);
        
        short b = -32768 ;
        char ch = '@';
        System.out.println(b);
        System.out.println(ch);

        boolean bool1 = true ;
        boolean bool2 = false;
        System.out.println(bool1 + " "+bool2);

        int num = 532332424;
        System.out.println(num);

        float flo = 10.7654321f;
        System.out.println(flo);

        //long is for integer value and double is for float value 
        long num2 = 5123413434234232343l;
        double dou = 34461743243.341344124145636525134534512454f;
        System.out.println(num2);
        System.out.println(dou);
        
    }
}
