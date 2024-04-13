package inf_algorithm.sorting_and_binsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            int j = i - 1;

            while (j >=0 && number < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = number;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
