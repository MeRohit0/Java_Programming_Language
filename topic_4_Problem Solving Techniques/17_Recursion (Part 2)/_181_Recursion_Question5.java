/*
    TOWER OF HANOI(Important!)

    You have 3 towers and N disks of different sizes which can slide on to any tower.\
    The puzzle starts with disks sorted in ascending order of size from top to bottom 
    (i.e., each disk sits on top of an even larger one).
    
    You have the following constraints:
    (1) Only one disk can be moved at a time.
    (2) A disk is slid off the top of one tower onto another tower.
    (3)A disk cannot be placed on top of a smaller disk.

    Write a program to move the disks from the first tower to thelast using Stacks.

 */
public class _181_Recursion_Question5 {

    public static void toh(int n , int A , int C , int B){ // move n disks from A to C using B 
        if(n == 0){
            return ;
        }
        toh( n - 1 , A , B , C) ; 
        System.out.println("Moving " + n + "th disk from " + A + " to " + C );
        toh( n - 1 , B , C , A );
    }
    public static void main (String args[]){
        int n = 3 ;
        toh(n , 1 , 3 ,2 ); // move n disks from A to C using B 
    }

}
