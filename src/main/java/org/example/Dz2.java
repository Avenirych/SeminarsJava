package org.example;
import java.util.Scanner;
// проверить, что х положительное
public class Dz2 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Input the number: ");
            int num = scan.nextInt();
            isPositive(num);
            System.out.println(isPositive(num));
        }
        private static boolean isPositive(int a) {

            if (a > 0)
                return true;
            return false;
        }
    }

