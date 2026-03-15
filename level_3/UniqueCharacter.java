package com.gla.level_3;
    import java.util.Scanner;

    public class UniqueCharacter {

        public static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (Exception e) {
            }
            return count;
        }

        public static char[] findUnique(String text) {

            int length = findLength(text);
            char[] temp = new char[length];
            int index = 0;

            for (int i = 0; i < length; i++) {

                char current = text.charAt(i);
                boolean unique = true;

                for (int j = 0; j < i; j++) {
                    if (current == text.charAt(j)) {
                        unique = false;
                        break;
                    }
                }

                if (unique) {
                    temp[index] = current;
                    index++;
                }
            }

            char[] result = new char[index];

            for (int i = 0; i < index; i++) {
                result[i] = temp[i];
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String text = sc.nextLine();

            char[] uniqueChars = findUnique(text);

            System.out.println("Unique characters:");

            for (int i = 0; i < uniqueChars.length; i++) {
                System.out.print(uniqueChars[i] + " ");
            }
        }
    }

