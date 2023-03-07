package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2309.
 */
public class Problem2309 {
    public static void main(String[] args) {
        final int maxInputCount = 9;
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[maxInputCount];
        int heightsSum = 0;

        for (int i = 0; i < maxInputCount; i++) {
            int height = sc.nextInt();
            heights[i] = height;
            heightsSum += height;
        }

        Arrays.sort(heights);
        boolean breakPoint = false;

        for (int i = 0; i < maxInputCount - 1; i++) {
            if (breakPoint) {
                break;
            }

            for (int j = i + 1; j < maxInputCount; j++) {
                if (heightsSum - (heights[i] + heights[j]) == 100) {
                    for (int k = 0; k < maxInputCount; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(heights[k]);
                    }
                    breakPoint = true;
                }
            }
        }
    }
}
