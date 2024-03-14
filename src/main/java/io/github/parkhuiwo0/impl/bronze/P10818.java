package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (min > number) {
                min = number;
            }

            if (max < number) {
                max = number;
            }
        }

        System.out.print(min + " " + max);
    }
}
