package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            totalPrice -= (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if (totalPrice == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
