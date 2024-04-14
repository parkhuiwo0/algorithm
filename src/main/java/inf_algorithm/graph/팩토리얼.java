package inf_algorithm.graph;

public class 팩토리얼 {
    static int dfs(int n) {
        if (n == 1) {
            return n;
        }
        return n * dfs(n-1);
    }

    public static void main(String[] args) {
        System.out.println(dfs(5));
    }
}
