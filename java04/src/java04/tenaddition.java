	package java04;

	import java.util.Scanner;

	public class tenaddition {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int total=1;

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	       

	        for (int i = 1; i <= n; i++) {
	            total = total + i;
	        }

	        System.out.println("Total = " + total);

	        sc.close();
	    }
	}


