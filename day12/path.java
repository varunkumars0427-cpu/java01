package day12;

public class path {

	    public static void main(String[] args) {

	        int rows = 3;
	        int columns = 3;

	        int[][] dp = new int[rows][columns];
	        for (int j = 0; j < columns; j++) {
	            dp[0][j] = 1;
	        }
	        for (int i = 0; i < rows; i++) {
	            dp[i][0] = 1;
	        }

	        for (int i = 1; i < rows; i++) {

	            for (int j = 1; j < columns; j++) {

	                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	            }
	        }

	        System.out.println("Number od oaths = " + dp[rows - 1][columns - 1]);
	    }
	}


