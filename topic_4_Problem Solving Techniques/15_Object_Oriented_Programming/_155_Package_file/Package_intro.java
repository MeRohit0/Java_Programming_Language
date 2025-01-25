/*
    Package is a group of similar types of classe, interfaces and sub-packages

    we have to use the package keyword to  create the package 

    NOTE : we have to store them in the same directory as the package name 

    if we have to use the class we have to import the class using import 
        and only the package class will be access not sub-package 

 */
package _155_Package_file ; 

import java.util.Scanner ;

public class Package_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();

    }    
    public static void hellomypackage(){
        System.out.println("this is the mypackage");
    }
}
