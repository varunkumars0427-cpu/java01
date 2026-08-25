package day06;

public class new_7 {

	    public static void main(String[] args) {

	        int[] marks = {50, 60, -20, 70, -10, 80, 40};

	        int currentMarks = 0;
	        int bestMarks = 0;

	        for (int i = 0; i < marks.length; i++) {

	            currentMarks = currentMarks + marks[i];

	            if (currentMarks < 0) {
	                currentMarks = 0;
	            }

	            if (currentMarks > bestMarks) {
	                bestMarks = currentMarks;
	            }
	        }

	        System.out.println("Best Marks = " + bestMarks);
	    }
	}

