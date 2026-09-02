package day11;

import java.util.*;

public class priority {
	public static void main(String[] args) {
		int[] numbers = {10,5,20,8,15,30,25};
		int k = 3;
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int number : numbers) {
			minHeap.add(number);
			
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		System.out.println("Top " + k + " largest numbers: ");
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}
}