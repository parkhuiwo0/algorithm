package io.github.parkhuiwo0.binarysearch.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int friendCount = Integer.parseInt(st.nextToken());

        int[] capacities = new int[count];

        for (int i = 0; i < count; i++) {
            capacities[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(capacities);

        System.out.println(getMaxCapacity(capacities, friendCount));
    }

    static long getMaxCapacity(int[] capacities, int friendCount) {
        long left = 1;
        long right = capacities[capacities.length - 1]; // min
        long mid = (left + right) / 2;

        while (left <= right) {
            mid = (left + right) / 2;

            if (isCanDistribute(capacities, friendCount, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    static boolean isCanDistribute(int[] capacities, int friendCount, long capacity) {
        long localizeCount = friendCount;
        for (int i = 0; i < capacities.length; i++) {
            long distributeCount = capacities[i] / capacity;
            localizeCount -= distributeCount;
        }

        return localizeCount <= 0;
    }
}
