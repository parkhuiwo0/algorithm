package inf_algorithm.graph.dfs;

import java.util.Scanner;

public class 중복순열 {
    static int[] arr;
    static int n, m;

    static void dfs(int l) {
        if (l == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[l] = i;
                dfs(l + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(0);
    }
}
