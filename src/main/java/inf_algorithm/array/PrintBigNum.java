package inf_algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintBigNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int before = Integer.parseInt(st.nextToken());
        System.out.print(before + " ");
        for (int i = 1; i < count; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (before < number) {
                System.out.print(number + " ");
            }

            before = number;
        }
    }
}
