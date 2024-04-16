package inf_algorithm.graph.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기 {

    static int maxScore, limit = 0;
    static int n;
    static int[] arr;
    static int[] tArr;

    static void solve(int v, int t, int s) {
        if (v == n + 1) {
            if (t <= limit) {
                maxScore = Math.max(s, maxScore);
            }
            return;
        }
        solve(v+1, t + tArr[v], s + arr[v]);
        solve(v+1, t, s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        limit = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        tArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            tArr[i] = Integer.parseInt(st.nextToken());
        }
        solve(0, 0, 0);
        System.out.println(maxScore);
    }
}
