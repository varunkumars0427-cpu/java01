package java04;

public class Electricity {

    public static void main(String[] args) {

        int[] units = {10, 15, 12, 20, 18, 14, 16};

        int total = 0;

        for (int s : units) {
            total = total + s;
        }

        System.out.println("Total electricity consumption = " + total + " units");
    }
}