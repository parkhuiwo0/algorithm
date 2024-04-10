package inf_algorithm.map_set_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class KindOfCost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < k; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(m.size() + " ");

        for (int i = k; i < n; i++) {
            Integer cnt = m.get(arr[i - k]);
            if (cnt != null) {
                if (cnt > 1) {
                    m.put(arr[i - k], cnt-1);
                }
                if (cnt <= 1) {
                    m.remove(arr[i - k]);
                }
            }

            m.put(arr[i], m.getOrDefault(arr[i] , 0) + 1);
            System.out.print(m.size() + " ");
        }
    }
}
