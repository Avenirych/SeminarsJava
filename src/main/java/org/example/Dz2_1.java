package org.example;
import java.util.Scanner;

//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2,
//начиная с c1. (6, 'a', 'b') -> "ababab"
public class Dz2_1 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Input the first symbol: ");
            String c1 = scan.nextLine();
            System.out.print("Input the second symbol: ");
            String c2 = scan.nextLine();
            System.out.print("Input N : ");
            int n = scan.nextInt();
            System.out.println(buildString(n, c1, c2));

        }

        static String buildString(int len, String sym1, String sym2) {
            String symbols = sym1 + sym2;
            String result = symbols.repeat(len / 2);
            return result;
        }
    }
