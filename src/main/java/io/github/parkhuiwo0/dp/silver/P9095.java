package io.github.parkhuiwo0.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[12];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(br.readLine());
            System.out.println(dp[number]);
        }
    }
}
