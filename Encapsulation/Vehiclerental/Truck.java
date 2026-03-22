package com.gla.Encapsulation.Vehiclerental;

    public class Truck extends Vehicle {

        public Truck(String number, double rate, String policy) {
            super(number, "Truck", rate, policy);
        }

        public double calculateRentalCost(int days) {
            return getRentalRate() * days + 1000;
        }
    }

