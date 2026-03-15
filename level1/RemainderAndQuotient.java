package com.gla.method.level1;
/*8. Write a program to take 2 numbers and print their quotient and reminder
Hint =>
a. Take user input as integer
b. Use division operator (/) for quotient and moduli operator (%) for reminder
c. Write Method to find the reminder and the quotient of a number*/
import java.util.Scanner;
public class RemainderAndQuotient {
public static int[] findRemainderAndQuotient(int number, int divisor){
    int Quotient=number%divisor;
    int Remainder=number/divisor;
    int result[]={Remainder,Quotient};
    return result;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        System.out.println("enter divisor");
        int divisor=sc.nextInt();
        int result[]=findRemainderAndQuotient(number,divisor);
        System.out.println("remainder"+result[0]);
        System.out.println("quotient"+result[1]);
    }


}
