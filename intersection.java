package day06;

public class intersection {
		public static void main(String[] args) {
	        int[] array1 = {10, 20, 30};
	        int[] array2 = {40, 50, 60};
	        int[] joined = new int[array1.length + array2.length];
	        for (int i = 0; i < array1.length; i++) {
	            joined[i] = array1[i];
	        }
	        for (int i = 0; i < array2.length; i++) {
	            joined[array1.length + i] = array2[i];
	        }
	        System.out.println("Joined Array:");
	        for (int i = 0; i < joined.length; i++) {
	            System.out.print(joined[i] + " ");
	        }
	    }

	}

