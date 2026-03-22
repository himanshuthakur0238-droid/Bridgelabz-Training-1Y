package com.gla.Encapsulation.Vehiclerental;

    public class Car extends Vehicle implements insurable {

        public Car(String number, double rate, String policy) {
            super(number, "Car", rate, policy);
        }

        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        public double calculateInsurance() {
            return 500;
        }

        public String getInsuranceDetails() {
            return "Car Insurance: Rs 500";
        }
    }

