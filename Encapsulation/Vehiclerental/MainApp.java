package com.gla.Encapsulation.Vehiclerental;

    public class MainApp {

        public static void main(String[] args) {

            Vehicle v1 = new Car("UP11-1234", 2000, "POL123");
            Vehicle v2 = new Bike("UP11-5678", 500, "POL456");
            Vehicle v3 = new Truck("UP11-9999", 4000, "POL789");

            calculateCost(v1, 3);
            calculateCost(v2, 2);
            calculateCost(v3, 5);
        }

        public static void calculateCost(Vehicle v, int days) {

            double rent = v.calculateRentalCost(days);
            double insurance = 0;

            if (v instanceof insurable) {
                insurable i = (insurable) v;
                insurance = i.calculateInsurance();
                System.out.println(i.getInsuranceDetails());
            }

            double total = rent + insurance;

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + rent);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total Cost: " + total);
            System.out.println("------------------------");
        }
    }

