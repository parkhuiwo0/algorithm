package inf_algorithm.graph;

public class 이진수출력 {
    static void dfs(int n) {
        if (n == 1 || n == 0) {
            System.out.print(n);
            return;
        }
        dfs(n / 2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        dfs(11);
    }
}
