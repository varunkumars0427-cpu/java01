package day13;

public class robinkarb1 {


	    static void search(String text, String pattern) {

	        int n = text.length();
	        int m = pattern.length();

	        int base = 256;
	        int prime = 101;

	        int patternHash = 0;
	        int textHash = 0;
	        int h = 1;

	        // Calculate h = base^(m-1) % prime
	        for (int i = 0; i < m - 1; i++) {
	            h = (h * base) % prime;
	        }

	        // Calculate initial hashes
	        for (int i = 0; i < m; i++) {
	            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
	            textHash = (base * textHash + text.charAt(i)) % prime;
	        }

	        // Search pattern
	        for (int i = 0; i <= n - m; i++) {

	            // If hash matches, check actual string
	            if (patternHash == textHash) {

	                boolean found = true;

	                for (int j = 0; j < m; j++) {

	                    if (text.charAt(i + j) != pattern.charAt(j)) {
	                        found = false;
	                        break;
	                    }
	                }

	                if (found) {
	                    System.out.println("Pattern found at index " + i);
	                }
	            }

	            // Calculate hash for next window
	            if (i < n - m) {

	                textHash = (base * (textHash
	                        - text.charAt(i) * h)
	                        + text.charAt(i + m)) % prime;

	                if (textHash < 0) {
	                    textHash = textHash + prime;
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


