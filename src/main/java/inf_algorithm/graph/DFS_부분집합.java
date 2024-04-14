package inf_algorithm.graph;

public class DFS_부분집합 {
    static int n;
    static int[] ch;

    static void dfs(int l) {
        if (l == n+1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 1) {
                    sb.append(i + " ");
                }
            }
            System.out.println(sb);
        }
        else {
            ch[l] = 1;
            dfs(l+1);
            ch[l] = 0;
            dfs(l+1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        dfs(1);
    }
}
