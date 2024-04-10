package inf_algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Doll {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int move = Integer.parseInt(st.nextToken());
            int selected = 0;

            for (int j = 0; j < n; j++) {
                selected = arr[j][move - 1];
                if (selected != 0) {
                    arr[j][move - 1] = 0;
                    break;
                }
            }

            if (selected == 0) {
                continue;
            }

            if (!stack.isEmpty()) {
                Integer peek = stack.peek();
                if (peek == selected) {
                    stack.pop();
                    cnt += 2;
                } else {
                    stack.push(selected);
                }
            } else {
                stack.push(selected);
            }
        }

        System.out.println(cnt);
    }
}
