package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] charArray = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                charArray[i][j] = s.charAt(j);
            }
        }
        int xCount = 0;
        int yCount = 0;

        for (int i = 0; i < n; i++) {
            boolean exist = false;
            for (int j = 0; j < m; j++) {
                if (charArray[i][j] == 'X') {
                    exist = true;
                }
            }
            if (!exist) {
                xCount++;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean exist = false;
            for (int j = 0; j < n; j++) {
                if (charArray[j][i] == 'X') {
                    exist = true;
                }
            }
            if (!exist) {
                yCount++;
            }
        }

        System.out.println(Math.max(xCount, yCount));
    }
}
