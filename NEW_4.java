package day06;

public class NEW_4 {

	    public static void main(String[] args) {
	        int[] numbers = { 2, 3, 1, 2, 4, 3 };
	        int target = 7;
	        int start = 0;
	        int sum = 0;
	        int minLength = numbers.length;

	        for (int end = 0; end < numbers.length; end++) {
	            sum = sum + numbers[end];

	            while (sum >= target) {
	                int length = end - start + 1;

	                if (length < minLength) {
	                    minLength = length;
	                }

	                sum = sum - numbers[start];
	                start++;
	            }
	        }

	        System.out.println("Smallest window length = " + minLength);
	    }
	}

