package com.gla.level_3;
    import java.util.Scanner;

    public class CharacterFrequency {

        public static String[][] findFrequency(String text) {

            int[] freq = new int[256];

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                freq[ch]++;
            }

            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (freq[ch] != 0) {
                    count++;
                    freq[ch] = -freq[ch];
                }
            }

            String[][] result = new String[count][2];

            int index = 0;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (freq[ch] < 0) {
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(-freq[ch]);
                    freq[ch] = 0;
                    index++;
                }
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

