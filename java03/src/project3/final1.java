package project3;

public class final1 {
	public static void main(String[] args) {
		System.out.println("varun");
		System.out.println("anand3");
		try {
			System.out.println("kishore");
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(" Arti handle"+ e.getMessage());
			
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}


