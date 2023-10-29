package io.github.parkhuiwo0.impl.bronze;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] scores = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);

        int maxScore = scores[n - 1];
        float temp = 0.0f;

        for (int score : scores) {
            temp += ((float) score / maxScore * 100);
        }

        System.out.println(temp/n);
    }

}
