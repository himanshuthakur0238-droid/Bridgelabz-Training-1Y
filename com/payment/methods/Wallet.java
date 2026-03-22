package com.payment.methods;
import com.payment.interfaces.Payment;

    public class Wallet implements Payment {

        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Wallet");
        }
    }

