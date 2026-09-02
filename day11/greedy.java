package day11;

public class greedy {
    public static void main(String[] args) {
        int[] start = {1, 2, 3, 5, 6};
        int[] end = {3, 4, 5, 7, 8};
           int lastEnd = end[0];
        System.out.println("Selected Activity: A");
            for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                System.out.println("Selected Activity: "
                        + (char) ('A' + i));

                lastEnd = end[i];
            }
        }
    }
}