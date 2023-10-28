package io.github.parkhuiwo0.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalCount = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int[] time = new int[totalCount];

        for (int i = 0; i < totalCount; i++) {
            time[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(time);

        int totalTime = 0;
        int previous = 0;

        for (int i = 0; i < totalCount; i++) {
            totalTime += previous + time[i];

            previous += time[i];
        }


        System.out.println(totalTime);
    }
}
