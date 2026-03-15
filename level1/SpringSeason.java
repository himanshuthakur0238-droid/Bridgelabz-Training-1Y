package com.gla.method.level1;
//Write a program SpringSeason that takes two int values month and day from the command
//line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring
//season and return a boolean true or false
import java.util.Scanner;
public class SpringSeason {
    boolean checkSpringSeason(int month,int day){
        if(month==3 && day>=20 && day<=31 || month==4&& day>=1&& day<=30 ||month==5&& day>=1&&day<=31 ||month==6 && day<=20&&day>=1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month");
        int month=sc.nextInt();
        System.out.println("enter day");
        int day=sc.nextInt();
        SpringSeason obj = new SpringSeason();
        boolean result = obj.checkSpringSeason(month,day);
        if(result ){
            System.out.println("spring season");
        }
        else{
            System.out.println("not spring season");
        }
    }
}



