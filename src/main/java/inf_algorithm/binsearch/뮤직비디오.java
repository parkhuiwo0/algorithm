package inf_algorithm.binsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뮤직비디오 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int left = Integer.MAX_VALUE, right = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right += arr[i];
            left = Math.min(left, arr[i]);
        }

        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int dvdCnt = 1;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if ((sum + arr[i]) > mid) {
                    dvdCnt++;
                    sum = arr[i];
                } else {
                    sum += arr[i];
                }
            }

            if (dvdCnt <= k) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
