package io.github.parkhuiwo0.binarysearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int[] nNums;
        int n = 0;
        int m = 0;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            nNums = new int[n];

            for (int i = 0; i < n; i++) {
                nNums[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                if (Arrays.binarySearch(nNums, Integer.parseInt(br.readLine())) >= 0) {
                    count++;
                }
            }

            System.out.println(count);

            count = 0;
            n = 0;
            m = 0;
        }
    }
}
