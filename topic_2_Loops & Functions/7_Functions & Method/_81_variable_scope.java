/*
    Scope of variable 
    1. Method scope  -- when the variable is define in method then onwards it can access 
    2. Block scope -- variable are only access inside of { block of code }
    3. Class scope -- the variable is declare inside of class 
    
3.-->     class name
        {
            varaible a 
    
1.-->       Method name()
            {
                variable b
            }

            print ( variable b is not access here )
        }
        print (  both varaible a and b are not access here );

    
2.-->   block   {

                 variable abc
        
                }
                variable abc is not access here 
    
    

 */
public class _81_variable_scope {
    
}
