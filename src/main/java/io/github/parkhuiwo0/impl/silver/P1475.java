package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));

            if (num == 6 || num == 9) {
                if (numbers[6] >= 1) {
                    numbers[6] -= 1;
                    continue;
                } else if (numbers[9] >= 1) {
                    numbers[9] -= 1;
                    continue;
                } else {
                    count++;
                    add(numbers);
                    numbers[num] -= 1;
                    continue;
                }
            }

            if (numbers[num] >= 1) {
                numbers[num] -= 1;
            } else {
                count++;
                add(numbers);
                numbers[num] -= 1;
            }
        }

        System.out.println(count);
    }

    static void add(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
    }
}
