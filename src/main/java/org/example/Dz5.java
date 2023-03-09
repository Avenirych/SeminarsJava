package org.example;
// должен вернуть массив длины len, каждое значение которого равно initialValue

import java.util.Scanner;
import java.util.Arrays;
public class Dz5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input amount : ");
            int amount = scan.nextInt();
            System.out.print("Input value : ");
            int num = scan.nextInt();
            System.out.println(Arrays.toString(createArray(amount, num)));
        }
        private static int[] createArray(int len, int initialValue) {

            int[] array = new int[len];
            for (int i = 0; i < array.length; i++)
                array[i] = initialValue;
            return array;
        }
    }

