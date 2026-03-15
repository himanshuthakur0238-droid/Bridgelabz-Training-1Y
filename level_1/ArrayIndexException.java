package com.gla.level_1;


    public class ArrayIndexException {

        static void handleException() {

            try {
                int arr[] = {10, 20, 30, 40, 50};

                System.out.println(arr[10]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException handled");
            }
        }

        public static void main(String[] args) {

            System.out.println("Handling Exception:");

            handleException();
        }
    }

