package homeworkweek9.program01_calculate;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main extends Calculator {
    public static void main(String[] args) {
        //Declaring Scanner Class to read input from console
        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” : ");
            String menu_command = scr.next();
            boolean c = menu_command.equalsIgnoreCase("N");

            if (c) {
                exit(0);//exits the program when user enters "N"
            } else {
                System.out.println("Enter 1st Number: ");
                int a = scr.nextInt();
                System.out.println("Enter 2nd Number: ");
                int b = scr.nextInt();
                System.out.println("Enter Symbol +, -, * or / : ");
                char symbol = scr.next().charAt(0);

                //created object to call parent class methods
                Main obj = new Main();
                obj.calculateResult(a, b, symbol);
            }
        }

    }
}
