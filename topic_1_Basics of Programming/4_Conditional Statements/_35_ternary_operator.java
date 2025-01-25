/*
ternary operator is if-else statement
it is use to assign the values  
syntax :  value_assign_to_variable = (test expression)?(true value):(false value);
 */


public class _35_ternary_operator {
  public static void main(String[] args) {
    int number = 53;

    //ternary operator
    String result = (number%2==0)?"true":"false";
    System.out.println(result);

  }  
}
