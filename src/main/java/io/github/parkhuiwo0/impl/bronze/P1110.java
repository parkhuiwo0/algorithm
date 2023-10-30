package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n2 = n;
        if (n < 10) {
            n *= 10;
            n2 = n;
        }

        int newNumber = 0;
        int cycle = 0;

        while (true) {
            newNumber = (n / 10) + (n % 10); // 8
            int temp = ((n % 10)*10) + (newNumber%10); // 68
            cycle++;

            if (temp == n2) {
                System.out.println(cycle);
                break;
            } else {
                n = temp;
            }
        }
    }
}
