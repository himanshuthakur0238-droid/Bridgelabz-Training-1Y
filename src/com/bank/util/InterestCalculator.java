package com.bank.util;

import static java.lang.Math.*;

public class InterestCalculator {

    public double calculateSimpleInterest(double p, double r, double t) {

        double si = (p * r * t) / 100;
        return si;
    }

    public double calculateCompoundInterest(double p, double r, double t) {

        double ci = p * (pow((1 + r / 100), t)) - p;
        return ci;
    }
}
