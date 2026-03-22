package com.gla.Encapsulation.Vehiclerental;


    public class Bike extends Vehicle implements insurable {

        public Bike(String number, double rate, String policy) {
            super(number, "Bike", rate, policy);
        }

        public double calculateRentalCost(int days) {
            return getRentalRate() * days;
        }

        public double calculateInsurance() {
            return 200;
        }

        public String getInsuranceDetails() {
            return "Bike Insurance: Rs 200";
        }
    }

