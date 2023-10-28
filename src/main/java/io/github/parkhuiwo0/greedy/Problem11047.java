package io.github.parkhuiwo0.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(input.nextToken());
        int k = Integer.parseInt(input.nextToken());

        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coins);

        int index = coins.length - 1;
        int count = 0;

        while (true) {

            if ((k - coins[index]) < 0) {
                index--;
                continue;
            }

            k -= coins[index];
            count++;
            index = coins.length - 1;

            if (k == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
