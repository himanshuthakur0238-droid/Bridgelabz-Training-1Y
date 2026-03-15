package com.gla.method.level1;

import java.util.Scanner;

public class handshakes {

    int calculatehandshakes(int n){
        int handshakes = (n * (n - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");

        int n = sc.nextInt();

        handshakes obj = new handshakes();
        int result = obj.calculatehandshakes(n);

        System.out.println("Handshakes = " + result);
    }
}