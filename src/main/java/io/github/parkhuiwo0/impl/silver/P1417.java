package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        if (count == 1) {
            System.out.println(0);
            return;
        }

        int answer = 0;
        int dasom = Integer.parseInt(br.readLine());
        int[] others = new int[count - 1];

        for (int i = 0; i < count - 1; i++) {
            others[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(others);

        while (true) {
            if (check(dasom, others)) {
                System.out.println(answer);
                break;
            } else {
                answer++;
                others[others.length -1] -= 1;
                dasom++;
            }
        }
    }

    static boolean check(int dasom, int[] others) {
        sort(others);

        return dasom > others[others.length - 1];
    }

    static void sort(int[] others) {
        Arrays.sort(others);
    }
}
