package inf_algorithm.graph.recursive;

public class 피보나치 {

    static int dfs(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return dfs(n-2) + dfs(n-1);
    }

    public static void main(String[] args) {
        dfs(10);
    }
}
