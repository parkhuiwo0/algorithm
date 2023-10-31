package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        Stack<Integer> moneys = new Stack<>();

        int removeCount = 0;

        for (int i = 0; i < n; i++) {
            moneys.push(Integer.parseInt(br.readLine()));
        }

        while (!moneys.empty()) {
            int money = moneys.pop();

            if (money == 0) {
                removeCount++;
                continue;
            }

            if (removeCount > 0) {
                removeCount--;
                continue;
            }

            sum += money;
        }


        System.out.println(sum);
    }
}
