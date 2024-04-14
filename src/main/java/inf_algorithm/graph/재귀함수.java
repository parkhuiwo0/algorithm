package inf_algorithm.graph;

import java.io.IOException;

public class 재귀함수 {
    static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        dfs(3);
    }
}
