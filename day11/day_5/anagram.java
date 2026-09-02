package day_5;

import java.util.*;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}