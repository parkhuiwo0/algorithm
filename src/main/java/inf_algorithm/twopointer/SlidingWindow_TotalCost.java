package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWindow_TotalCost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayCount = Integer.parseInt(st.nextToken());
        int windowSize = Integer.parseInt(st.nextToken());

        int[] array = new int[arrayCount];

        st = new StringTokenizer(br.readLine());
        int maxIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length - windowSize; i++) {
            int max = 0;
            for (int j = i; j < i + windowSize; j++) {
                max += array[j];
            }

            if (maxCount < max) {
                maxCount = max;
                maxIndex = i;
            }
        }
        System.out.println(maxCount);
    }
}
