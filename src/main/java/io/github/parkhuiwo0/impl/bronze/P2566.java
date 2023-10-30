package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CodingErrorAction;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int number = Integer.parseInt(st.nextToken());
                array[i][j] = number;
                if (number > max) {
                    max = number;
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
