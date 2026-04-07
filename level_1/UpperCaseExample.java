package com.gla.level_1;
    import java.util.Scanner;

    public class UpperCaseExample {

        // User-defined method
        static String convertUpper(String text) {

            String result = "";

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32);
                }

                result = result + ch;
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = sc.nextLine();

            // User-defined uppercase
            String user = convertUpper(text);

            // Built-in uppercase
            String builtin = text.toUpperCase();

            System.out.println("User-defined Uppercase: " + user);
            System.out.println("Built-in Uppercase: " + builtin);

            // Compare both results
            System.out.println("Both results are same: " + user.equals(builtin));
        }
    }

