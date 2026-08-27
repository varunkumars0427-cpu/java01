package day_8;

public class backtracking {

	    static void findNumber(int number) {

	        System.out.println("Trying: " + number);

	        if (number == 3) {
	            System.out.println("Number found: " + number);
	            return;
	        }

	        System.out.println("Wrong number. Go back and try again.");

	        findNumber(number + 1);
	    }

	    public static void main(String[] args) {

	        findNumber(1);
	    }
	}


