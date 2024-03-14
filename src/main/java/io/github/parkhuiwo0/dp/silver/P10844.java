package io.github.parkhuiwo0.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int dp[][] = new int[n+1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                dp[i][j] = 0;
                if (j-1 >= 0) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
                if (j+1 <= 9) {
                    dp[i][j] += dp[i - 1][j + 1];
                }
                dp[i][j] %= 1_000_000_000;
            }
        }

        long answer = 0;
        for (int i = 0; i <= 9; i++) {
            answer += dp[n][i];
        }
        answer%=1_000_000_000;
        System.out.println(answer);
    }
}
