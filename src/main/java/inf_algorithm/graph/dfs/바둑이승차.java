package inf_algorithm.graph.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이승차 {
    static int max, n = 0;
    static int[] arr;
    static int answer = 0;

    static void dfs(int v, int sum) {
        if (sum > max) {
            return;
        }

        if (v == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(v + 1, sum + arr[v]);
            dfs(v + 1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0);
        System.out.println(answer);
    }
}
