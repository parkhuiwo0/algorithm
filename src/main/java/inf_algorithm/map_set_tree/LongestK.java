package inf_algorithm.map_set_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i < n; i++) {
            for (int j=i+1; j < n; j++) {
                for (int l=j+1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 1;
        for (Integer integer : tSet) {
            if (k == cnt) {
                System.out.println(integer);
            }
            cnt++;
        }
    }
}
