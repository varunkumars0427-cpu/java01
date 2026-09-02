package day11;

public class Haufman {
	public static void main(String[] args) {
		String message = "AAAAABBCCD";
		System.out.println("Message: " + message);
		
		int a = 0, b = 0, c = 0 , d = 0;
		for (char ch: message.toCharArray()) {
			if(ch == 'A') 
				a++;
			else if (ch == 'B')
				b++;
			else if(ch == 'C')
				c++;
			else if (ch == 'D')
				d++;
		}
		
		System.err.println("\nFrequency:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		}
}