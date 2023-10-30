package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int classCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < classCount; i++) {
            System.out.println("Class " + (i+1));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            Integer[] scores = new Integer[students];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < students; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                if (max < scores[j]) {
                    max = scores[j];
                }

                if (min > scores[j]) {
                    min = scores[j];
                }
            }

            Arrays.sort(scores, Collections.reverseOrder());

            int maxGap = 0;

            for (int k = 0; k < students - 1; k++) {
                int gap = scores[k] - scores[k + 1];
                if (gap > maxGap) {
                    maxGap = gap;
                }
            }

            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, maxGap);
        }
    }
}
