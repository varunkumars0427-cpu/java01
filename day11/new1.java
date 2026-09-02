package day11;

import java.util.*;

public class new1 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 8, 15, 30, 25};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int number : numbers) {
            minHeap.add(number);
        }

        System.out.println("Minimum: " + minHeap.peek());

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int number : numbers) {
            maxHeap.add(number);
        }

        System.out.println("Maximum: " + maxHeap.peek());


        PriorityQueue<Integer> topK = new PriorityQueue<>();

        for (int number : numbers) {
            topK.add(number);

            if (topK.size() > k) {
                topK.poll();
            }
        }

        System.out.println("Top " + k + " largest numbers:");

        while (!topK.isEmpty()) {
            System.out.println(topK.poll());
        }

        int[] sorted = numbers.clone();
        Arrays.sort(sorted);

        double median;

        if (sorted.length % 2 == 0) {
            median = (sorted[sorted.length / 2 - 1]
                    + sorted[sorted.length / 2]) / 2.0;
        } else {
            median = sorted[sorted.length / 2];
        }

        System.out.println("Center / Median: " + median);
    }
}