package inf_algorithm.sorting_and_binsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 장난꾸러기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] compare = Arrays.copyOf(arr, arr.length);
        Arrays.sort(compare);

        for (int i = 0; i < compare.length; i++) {
            if (compare[i] != arr[i]) {
                System.out.print(i+1 + " ");
            }
        }

//        System.out.println(left + " " + right);
    }
}
