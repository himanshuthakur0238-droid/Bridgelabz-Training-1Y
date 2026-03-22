package com.gla.Encapsulation.LibrarySystem;
    class Book extends LibraryItem implements Reservable {
        private boolean isAvailable = true;

        public Book(String itemId, String title, String author) {
            super(itemId, title, author);
        }

        public int getLoanDuration() {
            return 14;
        }

        public void reserveItem(String borrowerName) {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Book reserved by " + borrowerName);
            } else {
                System.out.println("Book not available");
            }
        }

        public boolean checkAvailability() {
            return isAvailable;
        }
    }

