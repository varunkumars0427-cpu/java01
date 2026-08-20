package java04;

	public class Highestmarks {

	    public static void main(String[] args) {

	        int[] marks = {78, 65, 89, 92, 71};

	        int highest = marks[0];

	        for (int m : marks) {
	            if(m>highest) {
	            	highest=m;            	
	            }
	        }

	        System.out.println("Highest Marks = " + highest);
	    }
	}

