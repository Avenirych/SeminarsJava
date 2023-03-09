package org.example;
//Написать метод, принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
import java.util.Scanner;
public class Dz1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scan.nextInt();
        System.out.println(isSumBetween10And20(num1,num2));
    }
    public static boolean isSumBetween10And20(int a, int b) {

        if ((a + b) >= 10 & (a + b) <= 20)
            return true;
        return false;
    }
}
