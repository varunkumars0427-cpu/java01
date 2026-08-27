package day_8;

public class demo6 {
	    static String correctPassword = "231";

	    static void tryPassword(String password) {
	        System.out.println("Trying: " + password);

	        if (password.equals(correctPassword)) {
	            System.out.println("Password found: " + password);
	            return;
	        }

	        System.out.println("Wrong password. Go back and try another.");
	    }

	    public static void main(String[] args) {
	    	tryPassword("230");
	    	tryPassword("123");
	    	tryPassword("231");
	    	tryPassword("221");
	    }
	}
