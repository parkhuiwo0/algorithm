package io.github.parkhuiwo0.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = 1000 - Integer.parseInt(br.readLine());

        int count = 0;

        int[] money = {500, 100, 50, 10, 5, 1};

        for (int j : money) {
            if (price / j > 0) {
                count += price / j;
                price = price % j;
            }
        }

        System.out.println(count);
    }
}
