package day13;

public class Rabinkarp {
	

	    static void search(String text, String pattern) {

	        int n = text.length();
	        int m = pattern.length();

	        int patternHash = pattern.hashCode();

	        for (int i = 0; i <= n - m; i++) {

	            String part = text.substring(i, i + m);

	            if (part.hashCode() == patternHash) {

	                if (part.equals(pattern)) {
	                    System.out.println("Pattern found at index " + i);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {

	        String text = "I LOVE JAVA";
	        String pattern = "JAVA";

	        search(text, pattern);
	    }
	}


