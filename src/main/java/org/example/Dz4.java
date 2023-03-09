package org.example;
// проверить, является ли год високосным. если да - return true
import java.util.Scanner;
public class Dz4 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Input year: ");
            int num = scan.nextInt();
            isLeapYear(num);
            System.out.println(isLeapYear(num));
        }
        private static boolean isLeapYear(int year) {
            if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0)
                return true;
            return false;
        }
    }
