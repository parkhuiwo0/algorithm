package io.github.parkhuiwo0.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem18310 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] position = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            position[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(position);

        if (count % 2 ==0){
            System.out.println(position[count/2-1]);
        } else{
            System.out.println(position[count/2]);
        }
    }
}
