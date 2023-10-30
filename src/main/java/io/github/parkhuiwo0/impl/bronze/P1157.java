package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int idx = Character.toUpperCase(s.charAt(i)) - 65;
            counts[idx] = counts[idx] + 1;
        }

        int max = counts[0];
        boolean isSame = false;
        int maxIndex = 0;

        for (int i = 1; i < counts.length; i++) {
            if (max == counts[i]) {
                isSame = true;
                continue;
            }

            if (max < counts[i]) {
                max = counts[i];
                isSame = false;
                maxIndex = i;
            }
        }

        char maxAlphabet = (char) (maxIndex + 65);

        if (isSame) {
            System.out.println("?");
            return;
        }

        System.out.println(maxAlphabet);
    }
}
