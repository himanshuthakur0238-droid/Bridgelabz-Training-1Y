package com.payment.main;

import com.payment.interfaces.Payment;
import com.payment.methods.*;

    public class Main {
        public static void main(String[] args) {

            Payment p1 = new UPI();
            Payment p2 = new CreditCard();
            Payment p3 = new Wallet();

            p1.pay(500);
            p2.pay(1000);
            p3.pay(200);
        }
    }

