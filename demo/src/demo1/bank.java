package demo1;

import java.util.Scanner;

public class bank {

    static String name;
    static String designation;
    static int age;
    static double salary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Display Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    name = sc.next();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();

                    System.out.print("Enter designation: ");
                    designation = sc.next();

                    System.out.print("Enter salary: ");
                    salary = sc.nextDouble();

                    System.out.println("Employee created");
                    break;

                case 2:
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Designation: " + designation);
                    break;

                case 3:
                    System.out.println("Salary: " + salary);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
