package com.gla.method.level1;
import java.util.Scanner;

public class SimpleInterest {

    double CalculateSI(double principal,double rate,double time){
        double si=(principal*rate*time)/100;
        return si;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal");
        double principal = sc.nextDouble();

        System.out.println("Enter rate");
        double rate = sc.nextDouble();

        System.out.println("Enter time");
        double time = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();
        double result = obj.CalculateSI(principal,rate,time);

        System.out.println("Simple Interest = " + result);
    }
}