package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1032 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        char[] chars = br.readLine().toCharArray();

        for (int i = 0; i < count - 1; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != chars[j]) {
                    chars[j] = '?';
                }
            }
        }

        System.out.println(chars);
    }

}
