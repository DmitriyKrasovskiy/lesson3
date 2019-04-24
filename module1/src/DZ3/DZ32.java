package DZ3;

import java.util.Scanner;

public class DZ32 {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = consoleScanner.nextInt();

        System.out.println (number1);

        int num1 = (number1 - 7) % 10;

        if (num1 == 0)
            System.out.println("Последняя цифра числа = 7");
        else
            System.out.println("Последняя цифра числа != 7");



    }
}
