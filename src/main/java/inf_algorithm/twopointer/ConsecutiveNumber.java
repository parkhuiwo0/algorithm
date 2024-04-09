package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutiveNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayCount = Integer.parseInt(st.nextToken());
        int findNum = Integer.parseInt(st.nextToken());

        int[] array = new int[arrayCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < arrayCount; rt++) {
            sum += array[rt];
            if (findNum == sum) {
                answer++;
            }

            while (sum >= findNum) {
                sum -= array[lt];
                lt++;
                if (findNum == sum) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
