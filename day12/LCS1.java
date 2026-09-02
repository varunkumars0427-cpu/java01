package day12;

public class LCS1 {

    public static void main(String[] args) {

        String a = "I LOVE JAVA";

        String b = "I HATE JAVA";

        int m = a.length();

        int n = b.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1))

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                else

                    dp[i][j] = Math.max(dp[i - 1][j],
                                        dp[i][j - 1]);

            }

        }

        System.out.println("LCS Length: " + dp[m][n]);

    }
}