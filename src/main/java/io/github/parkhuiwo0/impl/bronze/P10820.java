package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int low = 0;
            int up = 0;
            int num = 0;
            int empty = 0;
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i);

                if (c == 32) {
                    empty++;
                    continue;
                }

                if (c >= 97) {
                    low++;
                    continue;
                }

                if (c >= 65) {
                    up++;
                    continue;
                }

                num++;
            }

            System.out.printf("%d %d %d %d\n", low, up, num, empty);
        }
    }
}
