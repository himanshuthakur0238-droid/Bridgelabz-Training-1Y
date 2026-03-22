package com.gla.Encapsulation.LibrarySystem;
    public class Main {
        public static void main(String[] args) {

            LibraryItem item1 = new Book("B101", "Java Basics", "James");
            LibraryItem item2 = new Magazine("M101", "Tech Today", "John");
            LibraryItem item3 = new DVD("D101", "Inception", "Nolan");

            item1.getItemDetails();
            System.out.println("Loan Duration: " + item1.getLoanDuration());

            item2.getItemDetails();
            System.out.println("Loan Duration: " + item2.getLoanDuration());

            item3.getItemDetails();
            System.out.println("Loan Duration: " + item3.getLoanDuration());

            Reservable r1 = (Reservable) item1;
            Reservable r2 = (Reservable) item2;

            r1.reserveItem("Rahul");
            r2.reserveItem("Amit");

            System.out.println("Book Available: " + r1.checkAvailability());
            System.out.println("Magazine Available: " + r2.checkAvailability());
        }
    }

