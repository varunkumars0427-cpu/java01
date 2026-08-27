package day_8;

public class binarysearch {
	
	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            System.out.println("Checking: " + arr[mid]);

	            if (arr[mid] == target) {
	                return mid;
	            } else if (target > arr[mid]) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; // Not found
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	        int target = 70;

	        int result = binarySearch(numbers, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	    }

}
