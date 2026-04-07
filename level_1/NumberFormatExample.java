package com.gla.level_1;
    import java.util.Scanner;

    public class NumberFormatExample{

        // Method to handle exception
        static void handleException(String text) {

            try {
                int num = Integer.parseInt(text);
                System.out.println("Number is: " + num);
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException handled");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String text = sc.next();

            handleException(text);
        }
    }

