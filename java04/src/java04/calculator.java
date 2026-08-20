package java04;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Multi");
        System.out.println("4. Div");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}