package inf_algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShowVerticalCounting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int showCount = 1;
        int maxHeight = Integer.parseInt(st.nextToken());
        for (int i = 1; i < count; i++) {
            int height = Integer.parseInt(st.nextToken());

            if (height > maxHeight) {
                showCount++;
                maxHeight = height;
            }
        }
        System.out.println(showCount);
    }
}
