package inf_algorithm.graph.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이같은부분집합 {
    static int[] arr;
    static int n = 0;
    static int total = 0;
    static boolean f = false;

    static void dfs(int v, int sum) {
        if (f) {
            return;
        }

        if (v == n) {
            if ((total - sum) == sum) {
                f = true;
            }
        } else {
            dfs(v+1, sum + arr[v]);
            dfs(v+1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        dfs(0, 0);

        System.out.println(f ? "YES" : "NO");
    }
}
