package org.example;
// напечатать строку source repeat раз

import java.util.Scanner;
public class Dz3 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Input sentence: ");
            String sentence = scan.nextLine();
            System.out.print("Input amount : ");
            int amount = scan.nextInt();
            printString(sentence, amount);
        }
        private static void printString(String source, int repeat) {
            System.out.println(source.repeat(repeat));
        }
    }

