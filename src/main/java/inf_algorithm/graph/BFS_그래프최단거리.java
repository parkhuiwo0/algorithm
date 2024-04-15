package inf_algorithm.graph;

import java.util.*;

public class BFS_그래프최단거리 {

    static int n, m;
    static int[] cnt;
    static List<List<Integer>> arr = new ArrayList<>();

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        cnt[1] = 0;

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                int n = q.poll();
                for (int nv : arr.get(n)) {
                    if (cnt[nv] == 0) {
                        cnt[nv] = cnt[n] + 1;
                        q.add(nv);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        cnt = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.get(a).add(b);
        }

        bfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + cnt[i]);
        }
    }
}
