package day13;

public class Demo3 {
	    public static void main(String[] args) {

	        int[] nums = {0, 1, 0, 3, 12};
	        int index = 0;

	        // Move all non-zero elements to the front
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }

	        // Fill the remaining positions with 0
	        while (index < nums.length) {
	            nums[index] = 0;
	            index++;
	        }

	        // Print the array
	        for (int i = 0; i < nums.length; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }
	}
