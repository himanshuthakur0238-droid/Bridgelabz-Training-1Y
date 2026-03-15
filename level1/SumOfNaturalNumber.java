package com.gla.method.level1;
//6. Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers
//using loop
import java.util.Scanner;
public class SumOfNaturalNumber {
    static int calculatesum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
    return sum;
    }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter number");
            int n=sc.nextInt();
            int result=calculatesum(n);
            System.out.println("sum="+result);
        }
}
