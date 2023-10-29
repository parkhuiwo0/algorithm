package io.github.parkhuiwo0.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem20115 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] capacity = new int[n];

        int i = 0;
        while (st.hasMoreElements()) {
            capacity[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(capacity);
        double totalCapacity = capacity[n-1];

        for (int j = 0; j < capacity.length - 1; j++) {
            totalCapacity += (double) capacity[j] / 2;
        }

        System.out.println(totalCapacity);
    }

}
