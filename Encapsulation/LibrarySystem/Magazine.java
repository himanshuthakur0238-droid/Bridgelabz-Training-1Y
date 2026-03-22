package com.gla.Encapsulation.LibrarySystem;
    class Magazine extends LibraryItem implements Reservable {
        private boolean isAvailable = true;

        public Magazine(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        public int getLoanDuration() {
            return 7;
        }

        public void reserveItem(String borrowerName) {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Magazine reserved by " + borrowerName);
            } else {
                System.out.println("Magazine not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

