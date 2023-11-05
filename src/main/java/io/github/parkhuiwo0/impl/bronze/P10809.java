package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P10809 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
        }

        for (int i = 97; i <= 122; i++) {
            Integer idx = map.get(i);
            if (idx == null) {
                System.out.print("-1 ");
            } else {
                System.out.print(idx + " ");
            }
        }
    }
}
