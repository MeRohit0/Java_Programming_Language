// if - else if conditional statement  

public class _32_if_else_if {
    public static void main(String[] args) {
        int age = 16;
        if( age >18 ){
            System.out.println("adult");
        }
        else if (age>=13 && age < 18 ){
            System.out.println("Teenager");
        }
        else{
            System.out.println("child");
        }
    }
}
