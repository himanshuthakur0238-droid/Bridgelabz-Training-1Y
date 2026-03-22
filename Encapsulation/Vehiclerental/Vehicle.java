package com.gla.Encapsulation.Vehiclerental;

    public abstract class Vehicle {

        private String vehicleNumber;
        private String type;
        private double rentalRate;
        private String insurancePolicyNumber;

        public Vehicle(String vehicleNumber, String type, double rentalRate, String policy) {
            this.vehicleNumber = vehicleNumber;
            this.type = type;
            this.rentalRate = rentalRate;
            this.insurancePolicyNumber = policy;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public String getType() {
            return type;
        }

        public double getRentalRate() {
            return rentalRate;
        }

        public abstract double calculateRentalCost(int days);
    }

