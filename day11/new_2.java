package day11;

public class new_2 {
    public static void main(String[] args) {

        String[] patient = {"A", "B", "C", "D", "E"};

        int[] arrival = {900, 915, 930, 1000, 1015};
        int[] departure = {930, 945, 1000, 1030, 1100};

        int lastDeparture = departure[0];

        System.out.println("Selected Patient: " + patient[0]);
        System.out.println("Arrival: " + arrival[0]);
        System.out.println("Departure: " + departure[0]);

        for (int i = 1; i < arrival.length; i++) {

            if (arrival[i] >= lastDeparture) {

                System.out.println("\nSelected Patient: " + patient[i]);
                System.out.println("Arrival: " + arrival[i]);
                System.out.println("Departure: " + departure[i]);

                lastDeparture = departure[i];
            }
        }
    }
}