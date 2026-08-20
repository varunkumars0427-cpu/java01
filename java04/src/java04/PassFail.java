package java04;

public class PassFail {

	public static void main (String[] args) {
		int[]  marks = {35,67,89,22,45,30,76};
		for(int m : marks) {
			if(m > 40) {
				System.out.println(m+"=PASS");
			}else {
				System.out.println(m+"=FAIL");
			}
		}
		
	}
}
