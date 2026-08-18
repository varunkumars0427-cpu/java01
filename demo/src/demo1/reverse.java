package demo1;

public class reverse {
    public static void main(String[] args) {

        String str = "Hello";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}
