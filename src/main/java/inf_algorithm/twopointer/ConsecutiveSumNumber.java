package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveSumNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n/2 + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int sum = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum+=arr[rt];
            if (sum == n) {
                cnt++;
            }

            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
