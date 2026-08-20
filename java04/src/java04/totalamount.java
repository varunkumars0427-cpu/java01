package java04;

public class totalamount {

    public static void main(String[] args) {

        int[] salary = {10000, 12000, 18000, 20000};
        int total = 0;

        for (int s : salary) {
            total = total + s;
        }

        System.out.println("Total Salary = " + total);
    }
}