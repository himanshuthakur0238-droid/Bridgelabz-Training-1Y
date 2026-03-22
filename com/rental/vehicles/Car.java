package com.rental.vehicles;

import com.rental.interfaces.Vehicle;

    public class Car implements Vehicle {

        public void rent() {
            System.out.println("Car rented");
        }

        public void returnVehicle() {
            System.out.println("Car returned");
        }
    }

