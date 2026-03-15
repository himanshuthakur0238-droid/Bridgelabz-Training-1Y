package com.gla.method.level1;
/*Create a program to divide N number of chocolates among M children. Print the number of
chocolates each child will get and also the remaining chocolates
Hint =>
a. Get an integer value from user for the numberOfchocolates and numberOfChildren.
b. Write the method to find the number of chocolates each child gets and number of
remaining chocolates*/
import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        int result[]={quotient,remainder};
        return result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        System.out.println("enter divisor");
        int divisor=sc.nextInt();
        int result[]=findRemainderAndQuotient(number,divisor);
        System.out.println("quotient"+result[0]);
        System.out.println("remainder"+result[1]);
    }
}
