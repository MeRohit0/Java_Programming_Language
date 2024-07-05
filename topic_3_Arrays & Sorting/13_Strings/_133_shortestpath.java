/*
    Program to solve the shotest path from origin given by string

    Approach 
    we have take E as east , W as West , N as north  and S as South 
    if we plot on graph as 
        N
        ^
    W<--|--->E     so if we increase or decrease the value as seen 
        S
 */
public class _133_shortestpath {

    public static float shortestpath(String path ){
        //calculate the vertex 
        int x = 0;
        int y = 0;
        for( int i = 0; i < path.length(); i++ ){
            if(path.charAt(i) == 'E' ){
                x++;
            }
            else if(path.charAt(i) == 'W' ){
                x--;
            }
            else if(path.charAt(i) == 'N' ){
                y++;
            }
            else {
                y--;
            }
        }
        
        //calculate the path from origin using formula 
        
        int x2 = x*x;
        int y2 = y*y ;

        float distance = (float)Math.sqrt(x2+y2);
        return distance;

    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}
