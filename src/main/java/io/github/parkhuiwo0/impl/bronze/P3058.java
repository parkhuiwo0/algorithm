package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int sum = 0;
            while (st.hasMoreElements()) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    if (min > num) {
                        min = num;
                    }
                    sum += num;
                }
            }

            System.out.println(sum + " " + min);
        }
    }
}
