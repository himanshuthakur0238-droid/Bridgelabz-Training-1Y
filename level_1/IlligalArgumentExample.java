package com.gla.level_1;

public class IlligalArgumentExample {

        // Method to generate exception
        static void generateException() {
            String text = "Hello";

            System.out.println(text.substring(4,2));
            // start index > end index
        }

        // Method to handle exception
        static void handleException() {

            try {
                String text = "Hello";

                System.out.println(text.substring(4,2));
            }
            catch
             (StringIndexOutOfBoundsException e) {
                System.out.println("Exception handled:Invalid Substring indexes");
            }
        }

        public static void main(String[] args) {



            handleException();
        }
    }

