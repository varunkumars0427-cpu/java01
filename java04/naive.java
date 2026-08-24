package day_5;
public class naive {

    public static void main(String[] args) {
        String text = "I love Java programming";
        String pattern = "I";

        int position = search(text, pattern);

        if (position != -1) {
            System.out.println("Pattern found at index: " + position);
        } else {
            System.out.println("Pattern not found");
        }
    }

    static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
