package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * bin search
 */
public class FindCommonElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrayACount = Integer.parseInt(br.readLine());
        int[] arrayA = new int[arrayACount];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Integer.parseInt(st.nextToken());
        }

        int arrayBCount = Integer.parseInt(br.readLine());
        int[] arrayB = new int[arrayBCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0; i < arrayA.length; i++) {
            int i1 = arrayA[i];
            int i2 = Arrays.binarySearch(arrayB, i1);
            if (i2 < 0) {
                continue;
            } else {
                answer.add(arrayA[i]);
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
