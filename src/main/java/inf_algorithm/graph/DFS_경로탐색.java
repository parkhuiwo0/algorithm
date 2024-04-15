package inf_algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS_경로탐색 {

    static int[][] arr;
    static int n;
    static int[] check;
    static int count = 0;

    static void dfs(int v) {
        if (v == 5) {
            count++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        check = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
        }
        check[1] = 1;
        dfs(1);

        System.out.println(count);
    }
}
