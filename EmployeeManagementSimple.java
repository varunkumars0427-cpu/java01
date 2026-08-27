package day_07;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSimple {

    static class Employee {
        String name;
        int age;
        String designation;
        double salary;

        Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean exitProgram = false;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    raiseSalary();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!exitProgram);
    }

    // Case 1: Create employee(s)
    static void create() {
        String again;
        do {
            // Name: only up to 2 spaces allowed (e.g. "First Middle Last")
            String name;
            while (true) {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                if (countSpaces(name) <= 2) {
                    break;
                }
                System.out.println("Invalid name. Only up to 2 spaces are allowed.");
            }

            // Age: must be between 18 and 60
            int age;
            while (true) {
                System.out.print("Enter age (18-60): ");
                age = Integer.parseInt(sc.nextLine().trim());
                if (age >= 18 && age <= 60) {
                    break;
                }
                System.out.println("Invalid age. Age must be between 18 and 60.");
            }

            // Designation: single letter p, t, or m
            String letter;
            while (true) {
                System.out.print("Enter designation (p - Programmer, t - Tester, m - Manager): ");
                letter = sc.nextLine().trim().toLowerCase();
                if (letter.equals("p") || letter.equals("t") || letter.equals("m")) {
                    break;
                }
                System.out.println("Invalid input. Please enter p, t, or m.");
            }

            String designation;
            double salary;
            if (letter.equals("m")) {
                designation = "Manager";
                salary = 50000;
            } else if (letter.equals("p")) {
                designation = "Programmer";
                salary = 35000;
            } else {
                designation = "Tester";
                salary = 25000;
            }

            employees.add(new Employee(name, age, designation, salary));
            System.out.println(name + " added with base salary " + salary);

            System.out.print("Add another person? (yes/no): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("yes"));
    }

    // Counts the number of spaces in a string
    static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Case 2: Display all employees
    static void display() {
        if (employees.isEmpty()) {
            System.out.println("No employees created yet.");
            return;
        }
        System.out.println("\n----- EMPLOYEE LIST -----");
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.println((i + 1) + ". Name: " + e.name +
                    " | Age: " + e.age +
                    " | Designation: " + e.designation +
                    " | Salary: " + e.salary);
        }
    }

    // Case 3: Raise salary for one chosen employee only
    static void raiseSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees created yet.");
            return;
        }

        System.out.print("Enter name of employee to raise salary: ");
        String name = sc.nextLine();

        Employee found = null;
        for (Employee e : employees) {
            if (e.name.equalsIgnoreCase(name)) {
                found = e;
                break;
            }
        }

        if (found == null) {
            System.out.println("Employee not found.");
            return;
        }

        double percent;
        while (true) {
            System.out.print("Enter raise percentage (1-10): ");
            percent = Double.parseDouble(sc.nextLine().trim());
            if (percent >= 1 && percent <= 10) {
                break;
            }
            System.out.println("Invalid percentage. Please enter a value between 1 and 10.");
        }

        found.salary = found.salary + (found.salary * percent / 100);
        System.out.println("New salary of " + found.name + " is " + found.salary);
    }

    // Case 4: Exit
    static void exit() {
        System.out.print("Are you sure you want to exit? (yes/no): ");
        String confirm = sc.nextLine().trim();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Exiting program. Goodbye!");
            exitProgram = true;
        } else {
            System.out.println("Okay, returning to menu.");
        }
    }
}
