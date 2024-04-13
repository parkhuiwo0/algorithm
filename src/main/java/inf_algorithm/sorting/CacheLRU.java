package inf_algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CacheLRU {
    static int cacheCnt = 0;
    static int n = 0;
    static int k = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] cache = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int task = arr[i];
            int existIdx = getIndex(task, cache);
            if (existIdx > -1) {
                securing(cache, existIdx);
                cache[0] = task;
                continue;
            }

            securing(cache, n-1);
            cache[0] = task;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }

    private static void securing(int[] arr, int existIdx) {
        for (int j = existIdx; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
    }

    private static int getIndex(int task, int[] cache) {
        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == task){
                return i;
            }
        }
        return -1;
    }
}
