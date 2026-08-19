package project3;

public class handling {
	public static void main(String[] args) {
		try {
			System.out.println("anand");
			System.out.println(10 / 0);
		} catch (NullPointerException ne) {
			System.out.println("u r getting ne" + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code"); // this line not executed
	}
}
