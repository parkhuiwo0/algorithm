package inf_algorithm.graph.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    static int n, m;
    static int min = Integer.MAX_VALUE;
    static Integer[] arr;

    static void dfs(int l, int sum) {
        if (l >= min || sum > m) {
            return;
        }

        if (sum == m) {
            min = Math.min(min, l);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        dfs(0, 0);
        System.out.println(min);
    }

    static class Failed {
        static int n, m;
        static int min = Integer.MAX_VALUE;
        static int[] arr;

        static void dfs(int l, int sum) {
            if (l > min || sum > m) {
                return;
            }
            if (sum == m) {
                min = Math.min(min, l);
            }

            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum + arr[i]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            arr = new int[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            m = sc.nextInt();


            dfs(0, 0);
            System.out.println(min);
        }
    }
}
