package inf_algorithm.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 송아지찾기 {

    static int m;
    static int[] move = {1, -1, 5};

    static int bfs(int root) {
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        int[] arr = new int[10001];
        arr[root] = 1;

        int moved = 0;
        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                int position = q.poll();
                if (position == m) {
                    return moved;
                }
                for (int distance : move) {
                    int movedPosition = position + distance;
                    if (movedPosition >= 1 && movedPosition <= 10000 && arr[movedPosition] == 0) {
                        arr[movedPosition] = 1;
                        q.offer(movedPosition);
                    }
                }
            }
            moved++;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n));
    }
}
