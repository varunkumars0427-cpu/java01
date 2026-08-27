package day_8;

public class demo3 {
	 static void count(int n) {
	        if (n == 0) {
	            return;
	        }
	        System.out.println(n);
	        count(n - 1);    // recursive call is the LAST operation
	    }

	    public static void main(String[] args) {
	        System.out.println("asrasdf");
	        count(5);
	        System.out.println("asrasdfs");
	    }
	}
