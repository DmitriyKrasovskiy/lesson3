package DZ3;

import java.util.Scanner;


public class DZ33 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first rectangle side");
        String s1 = reader.nextLine();
        System.out.println("Enter second rectangle side");
        String s2 = reader.nextLine();
        System.out.println("Enter circle radius");
        String r = reader.nextLine();

        int side1 = Integer.parseInt(s1);
        int side2 = Integer.parseInt(s2);
        int radius = Integer.parseInt(r);

        if
        (Math.sqrt(side1*side1+side2*side2) < 2*radius)
        System.out.println("You closed all rectangle");
        else
            System.out.println("Sorry, you need bigger paper");


    }
        }