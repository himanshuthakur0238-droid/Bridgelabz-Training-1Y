package com.rental.vehicles;

import com.rental.interfaces.Vehicle;

    public class Bus implements Vehicle {

        public void rent() {
            System.out.println("Bus rented");
        }

        public void returnVehicle() {
            System.out.println("Bus returned");
        }
    }

