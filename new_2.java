package day06;

public class new_2 {

	    public static void main(String[] args) {

	        int[] numbers = {10, 20, 30, 40, 50};
	        int windowSize = 2;

	        int[] prefix = new int[numbers.length + 1];

	        for (int i = 0; i < numbers.length; i++) {
	            prefix[i + 1] = prefix[i] + numbers[i];
	        }

	        for (int i = 0; i <= numbers.length - windowSize; i++) {

	            int sum = prefix[i + windowSize] - prefix[i];

	            System.out.println("sum = " + sum);
	        }
	    }
	}


