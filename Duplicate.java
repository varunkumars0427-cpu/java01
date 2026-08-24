package day_5;

public class Duplicate {
    public static void main(String[] args) {

        String str = "PROGRAMMING";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
