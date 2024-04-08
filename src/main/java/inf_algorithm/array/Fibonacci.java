package inf_algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] dp = new int[count];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < count; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
