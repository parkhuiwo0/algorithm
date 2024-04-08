package inf_algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RockPaperScissors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[2][count];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < count; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < count; j++) {
            int a = array[0][j];
            int b = array[1][j];

            if (a == b) {
                System.out.println("D");
            }

            if (a == 1 && b == 3) {
                System.out.println("A");
            }

            if (a == 2 && b == 1) {
                System.out.println("A");
            }

            if (a == 3 && b == 2) {
                System.out.println("A");
            }

            if (b == 1 && a == 3) {
                System.out.println("B");
            }

            if (b == 2 && a == 1) {
                System.out.println("B");
            }

            if (b == 3 && a == 2) {
                System.out.println("B");
            }
        }
    }
}
