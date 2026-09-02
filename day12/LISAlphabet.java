package day12;

public class LISAlphabet {
		public static void main(String[] args) {

	        char[] arr = {'A', 'C', 'B', 'D', 'F', 'E'};

	        System.out.println("LIS Length = " + lis(arr));
	    }

	    public static int lis(char[] arr) {

	        int n = arr.length;

	        int[] dp = new int[n];

	        // Every character itself is an LIS of length 1
	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	        }

	        // Check previous characters
	        for (int i = 1; i < n; i++) {

	            for (int j = 0; j < i; j++) {

	                if (arr[j] < arr[i]) {

	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	        }

	        int max = 0;

	        for (int i = 0; i < n; i++) {
	            max = Math.max(max, dp[i]);
	        }

	        return max;
	    }

}
