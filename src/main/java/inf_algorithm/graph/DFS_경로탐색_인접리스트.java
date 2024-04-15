package inf_algorithm.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS_경로탐색_인접리스트 {
    static int n, m, cnt = 0;
    static int[] check;
    static List<List<Integer>> arr = new ArrayList<>();

    static void dfs(int v){
        if (v==5) {
            cnt++;
            return;
        }
        for (int g : arr.get(v)) {
            if (check[g] == 0) {
                check[g] = 1;
                dfs(g);
                check[g] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        check = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.get(a).add(b);
        }

        check[1] = 1;
        dfs(1);
        System.out.println(cnt);
    }
}
