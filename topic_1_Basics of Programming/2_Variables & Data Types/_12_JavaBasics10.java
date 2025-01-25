//  Program for Type Casting (also known as narrowing or explicit)
//  its done by using () Parentheses bracket 
public class _12_JavaBasics10 {
    public static void main(String args[]){
        float marks = 999.999f;
        byte marks2 = (byte)marks;  // byte range is -128 to 127
        int marks3 = (int)marks ;
        System.out.println("Your Marks in Byte is : "+marks2);
        System.out.println("Your Marks in Int is : "+marks3);
        
    }
}
