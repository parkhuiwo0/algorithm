package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LogestConsecutiveNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];

        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int count = 0;
        int lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            int rightPoint = arr[rt];
            if (rightPoint == 0) {
                count++;
            }

            while (count > k) {
                if (arr[lt] == 0) {
                    count--;
                }
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.println(answer);
    }
}
