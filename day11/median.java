package day11;

import java.util.PriorityQueue;
import java.util.Collections;

public class median{

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 25, 30, 15, 40,};

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int number : numbers) {

            if (maxHeap.isEmpty() || number <= maxHeap.peek()) {
                maxHeap.add(number);
            } else {
                minHeap.add(number);
            }

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            }

            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        double median;

        if (maxHeap.size() == minHeap.size()) {
            median = (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            median = maxHeap.peek();
        }

        System.out.println("Median = " + median);
    }
}
