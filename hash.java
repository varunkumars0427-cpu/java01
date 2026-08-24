package day_5;
public class hash {
    public static void main(String[] args) {
        String text = "I love Java programming";
        String pattern = "o";

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

        int patternHash = 0;
        int textHash = 0;

        for (int i = 0; i < m; i++) {
            patternHash += pattern.charAt(i);
            textHash += text.charAt(i);
        }

        for (int i = 0; i <= n - m; i++) {

            if (patternHash == textHash) {

                boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return i;
                }
            }
            if (i < n - m) {
                textHash = textHash
                        - text.charAt(i)
                        + text.charAt(i + m);
            }
        }

        return -1;
    }
}