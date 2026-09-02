package day12;

public class matrix {

	    public static void main(String[] args) {

	        int[][] matrix = {
	            {10, 20, 30, 40},
	            {15, 25, 35, 45},
	            {27, 29, 37, 48},
	            {50, 55, 60, 70}
	        };

	        int target = 37;
	        int row = 0;
	        int col = matrix[0].length - 1;

	        while (row < matrix.length && col >= 0) {

	            if (matrix[row][col] == target) {
	                System.out.println("Element found");
	                return;
	            }
	            else if (matrix[row][col] > target) {
	                col--;
	            }
	            else {
	                row++;
	            }
	        }

	        System.out.println("Element not found");
	    }
	
}
