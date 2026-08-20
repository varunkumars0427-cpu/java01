package java04;

public class searching {

	    public static void main(String[] args) {

	        int[] numbers = {10, 20, 30, 40, 50};
	        int target = 70;

	        boolean found = false;

	        for (int i = 0; i < numbers.length; i++) {

	            if (numbers[i] == target) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Number found");
	        } else {
	            System.out.println("Number not found");
	        }
	    }
	}

