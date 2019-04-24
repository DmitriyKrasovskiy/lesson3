package DZ3;

import java.util.Scanner;

public class DZ34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter moneyAmount");
        String mA = reader.nextLine();

        int moneyAmount = Integer.parseInt(mA);

        if ((moneyAmount < 5) & (moneyAmount > 1))
            System.out.println("Summ =" + " " + moneyAmount + " " + "рубля");
        if ((moneyAmount == 1))
            System.out.println("Summ =" + " " + moneyAmount + " " + "рубль");
        if ((moneyAmount > 5) & (moneyAmount <= 20))
            System.out.println("Summ =" + " " + moneyAmount + " " + "рублей");

        else
            switch (moneyAmount%10){
                case 1:
                    System.out.println("Summ =" + " " + moneyAmount + " " + "рубль");
                    break;
                case 2: case 3: case 4:
                    System.out.println("Summ =" + " " + moneyAmount + " " + "рубля");
                    break;
                case 5: case 6: case 7: case 8: case 9: case 0:
                    System.out.println("Summ =" + " " + moneyAmount + " " + "рублей");
                    break;

            }

    }

}
