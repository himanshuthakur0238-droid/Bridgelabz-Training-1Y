package com.gla.Encapsulation.LibrarySystem;
    interface Reservable {
        void reserveItem(String borrowerName);
        boolean checkAvailability();
    }

