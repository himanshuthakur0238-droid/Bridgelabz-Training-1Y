package com.gla.level_3;
    import java.util.Scanner;

    public class FrequencyUsingUnique {

        public static char[] uniqueCharacters(String text) {

            char[] temp = new char[text.length()];
            int index = 0;

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);
                boolean unique = true;

                for (int j = 0; j < i; j++) {
                    if (ch == text.charAt(j)) {
                        unique = false;
                        break;
                    }
                }

                if (unique) {
                    temp[index] = ch;
                    index++;
                }
            }

            char[] result = new char[index];

            for (int i = 0; i < index; i++) {
                result[i] = temp[i];
            }

            return result;
        }

        public static String[][] findFrequency(String text) {

            int[] freq = new int[256];

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                freq[ch]++;
            }

            char[] unique = uniqueCharacters(text);

            String[][] result = new String[unique.length][2];

            for (int i = 0; i < unique.length; i++) {
                char ch = unique[i];
                result[i][0] = String.valueOf(ch);
                result[i][1] = String.valueOf(freq[ch]);
            }

            return result;
        }

        public static void display(String[][] data) {

            System.out.println("Character\tFrequency");

            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i][0] + "\t\t" + data[i][1]);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            String text = sc.nextLine();

            String[][] result = findFrequency(text);

            display(result);
        }
    }

