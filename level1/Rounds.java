package com.gla.method.level1;
//An athlete runs in a triangular park with sides provided as input by the user in meters. If the
//athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//a. Take user input for 3 sides of a triangle
//b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
import java.util.Scanner;
public class Rounds {
    int calculaterounds(int side1,int side2,int side3) {
        int p = (side1 + side2 + side3) ;
        int round = 5000 / p;
        return round;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of first side");
        int side1=sc.nextInt();
        System.out.println("enter value of second side");
        int side2=sc.nextInt();
        System.out.println("enter value of third side");
        int side3=sc.nextInt();
        Rounds obj=new Rounds();
        int result=obj.calculaterounds(side1,side2,side3);
        System.out.println("rounds"+result);

    }
}
