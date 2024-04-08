package inf_algorithm.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MergeArrayAndSort {
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

        int p1 = 0, p2 = 0;

        while (p1 < arrayACount && p2 < arrayBCount) {
            if (arrayA[p1] < arrayB[p2]) {
                answer.add(arrayA[p1]);
                p1++;
            } else {
                answer.add(arrayB[p2]);
                p2++;
            }
        }

        while (p1 < arrayACount) {
            answer.add(arrayA[p1++]);
        }

        while (p2 < arrayBCount) {
            answer.add(arrayB[p2++]);
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
