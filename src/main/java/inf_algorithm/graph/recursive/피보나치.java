package inf_algorithm.graph.recursive;

public class 피보나치 {
    static int[] arr;

    static int dfs(int n) {
        if (n == 1 || n == 2) {
            return arr[n] = 1;
        }

        return arr[n] = dfs(n-2) + dfs(n-1);
    }

    public static void main(String[] args) {
        arr = new int[11];
        dfs(10);
        for (int i = 1; i<=10; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
