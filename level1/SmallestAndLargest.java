package com.gla.method.level1;
/*Write a program to find the smallest and the largest of the 3 numbers.
        Hint =>
a. Take user input for 3 numbers
b. Write a single method to find the smallest and largest of the three numbers

3*/
import java.util.Scanner;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest=number1;
        int largest=number1;

      if(number2<number1) {
          smallest = number2;
      }
       if(number3<number2) {
           smallest = number3;
       }
       if(number2>number1) {
           largest = number2;
       }
       if(number3>number1) {
           largest = number3;
       }
        int result[]={smallest,largest};
        return result;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int number1=sc.nextInt();
        System.out.println("enter second number");
        int number2=sc.nextInt();
        System.out.println("enter third number");
       int number3=sc.nextInt();
        int result[]=findSmallestAndLargest(number1,number2,number3);
        System.out.println("smallest is"+result[0]);
        System.out.println("largest is"+result[1]);
    }
}
