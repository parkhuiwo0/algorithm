package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
