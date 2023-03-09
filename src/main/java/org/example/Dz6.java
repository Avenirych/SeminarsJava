package org.example;
import java.util.Arrays;

//Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Dz6 {
        public static void main(String[] args) {

            int[] ints = new int[] {1, 0, 1, 0, 0, 1, 1, 0, 1};
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 0)
                    ints[i] = 1;
                else
                    ints[i] = 0;
            }
            System.out.println(Arrays.toString(ints));
        }
    }
