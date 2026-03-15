package com.gla.level_1;
    import java.util.Scanner;

    public class StringCharacters {

        // User-defined method to convert string to char array
        static char[] getCharacters(String str) {

            char arr[] = new char[str.length()];

            for(int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
            }

            return arr;
        }

        // Method to compare two char arrays
        static boolean compareArrays(char a[], char b[]) {

            if(a.length != b.length)
                return false;

            for(int i = 0; i < a.length; i++) {
                if(a[i] != b[i])
                    return false;
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a String: ");
            String text = sc.next();

            // User-defined method
            char arr1[] = getCharacters(text);

            // Built-in method
            char arr2[] = text.toCharArray();

            System.out.print("User-defined array: ");
            for(char c : arr1)
                System.out.print(c + " ");

            System.out.println();

            System.out.print("Built-in array: ");
            for(char c : arr2)
                System.out.print(c + " ");

            System.out.println();

            boolean result = compareArrays(arr1, arr2);

            System.out.println("Both arrays are same: " + result);
        }
    }

