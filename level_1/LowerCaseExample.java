package com.gla.level_1;
    import java.util.Scanner;

    public class LowerCaseExample {

        // User-defined method
        static String convertLower(String text) {

            String result = "";

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }

                result = result + ch;
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = sc.nextLine();

            // User-defined lowercase
            String user = convertLower(text);

            // Built-in lowercase
            String builtin = text.toLowerCase();

            System.out.println("User-defined Lowercase: " + user);
            System.out.println("Built-in Lowercase: " + builtin);

            // Compare both
            System.out.println("Both results are same: " + user.equals(builtin));
        }
    }

