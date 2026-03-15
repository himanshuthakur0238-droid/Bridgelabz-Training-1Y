package com.bank.main;

import com.bank.util.InterestCalculator;

public class MainApp {

    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        double time = 2;

        InterestCalculator calc = new InterestCalculator();

        double si = calc.calculateSimpleInterest(principal, rate, time);
        double ci = calc.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
