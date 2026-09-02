package day12;

public class path_sum {

	    public static void main(String[] args) {

	        int[][] grid = {
	            {1, 1, 1},
	            {1, 2, 3},
	            {4, 2, 1}
	        };

	        int rows = 3;
	        int columns = 3;

	        int[][] dp = new int[rows][columns];

	        dp[0][0] = grid[0][0];

	        // First row
	        for (int j = 1; j < columns; j++) {
	            dp[0][j] = dp[0][j - 1] + grid[0][j];
	        }

	        // First column
	        for (int i = 1; i < rows; i++) {
	            dp[i][0] = dp[i - 1][0] + grid[i][0];
	        }

	        // Remaining cells
	        for (int i = 1; i < rows; i++) {

	            for (int j = 1; j < columns; j++) {

	                dp[i][j] = grid[i][j]
	                         + Math.min(dp[i - 1][j], dp[i][j - 1]);
	            }
	        }

	        System.out.println("Minimum Path Sum = " + dp[rows - 1][columns - 1]);
	    }
	}


