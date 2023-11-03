package io.github.parkhuiwo0.binarysearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int searchCount = Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < searchCount; i++) {
            if (Arrays.binarySearch(nums, Integer.parseInt(st2.nextToken())) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
