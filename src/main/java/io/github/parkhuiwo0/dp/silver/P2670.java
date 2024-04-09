package io.github.parkhuiwo0.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        double[] numbers = new double[size];
        double[] d = new double[size];

        double max = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(br.readLine());
        }

        d[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            double number = numbers[i];
            d[i] = Math.max(number, number * d[i - 1]);
            max = Math.max(d[i], max);
        }

        System.out.print(String.format("%.3f", max));
    }
}
