package com.gla.Encapsulation.LibrarySystem;
    class DVD extends LibraryItem implements Reservable {
        private boolean isAvailable = true;

        public DVD(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        public int getLoanDuration() {
            return 5;
        }

        public void reserveItem(String borrowerName) {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("DVD reserved by " + borrowerName);
            } else {
                System.out.println("DVD not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

