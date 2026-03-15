package com.gla.method.level1;
//4. Write a program to check whether a number is positive, negative, or zero.
//        Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
 //       for positive number and 0 if number is zero
import java.util.Scanner;
public class CheckNum {
    int checknumber(int n) {
        if (n < 0) {
            System.out.println("negative");
        } else if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
        return 0;
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number");
            int n=sc.nextInt();

            CheckNum obj=new CheckNum();
            int result= obj.checknumber(n);
        }

}
