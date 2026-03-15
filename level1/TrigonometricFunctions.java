package com.gla.method.level1;
/*11. Write a program to calculate various trigonometric functions using Math class given an angle
        in degrees
        Hint =>
a. Method to calculate various trigonometric functions, Firstly convert to radians and then
use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)*/
import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculatetrigonometricfunction(double angle){
        double radian=Math.toRadians(angle);
        double sin=Math.sin(radian);
        double cos=Math.cos(radian);
        double tan=Math.tan(radian);
        double result[]={sin,cos,tan};
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter angle");
        Double angle=sc.nextDouble();
        double result[]=calculatetrigonometricfunction(angle);
        System.out.println("the value of sin"+result[0]);
        System.out.println("the value of cos"+result[1]);
        System.out.println("the value of tan"+result[2]);

    }
}
