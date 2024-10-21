/*
    Introduction to Recursion 

    Recursion is a method of solving a computational problem where the solution depends on solution to 
        smaller instances of the same problem 

    Its is also know as DFS (Depth first search)

        top to bottom(towards base class)

              |      f(5) = 5 * f(4)<--                                     ^
              |                  |    |                                     |      Combine solution 
              |                  4 * f(3)<--                                |
              |                       |    |                                |
              |                       3 * f(2)<--                           |
              |                             |    |                          |
              |                             2 * f(1)<--                     |
              |                                  |     |                    |
              |                                 1 * f(0) <--                |
              |                                        |     |              |
              |                                        0 ----               |


    We can have 2 ways direction 
    1. top to bottom (towards Base case)
    2. bottom to up 


    We should know 3 conditions 
        1. Base case
        2. Kaam (working)
        3. f (n -1 )    (inner call )


    f(n) = n * f( n - 1 )

    Internal working of recusion 
        
    Call Stack :
        we use the call stack to track and store the function call and variables 
        
    Frame :
        whenever the call is made the data members are put into call frame and that 
            call frame push into the stack .
        
            and when we return the function the call frame is pop from the top of stack 
        
    Stack overflow :
        We should be aware that data members are stored in the call stack therefore 
            if  case 1. mutiple calls are made or 
                case 2. we store large number of varible at each function call 
                we will get the stack overflow error 

    
    

 */
public class _163_Recursion_Introduction {
    
}
