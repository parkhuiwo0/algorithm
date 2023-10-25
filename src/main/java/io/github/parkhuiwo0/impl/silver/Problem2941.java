package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem2941 {
    public static void main(String[] args) throws IOException {

        Map<String, Boolean> alphabets = new HashMap<>();

        alphabets.put("c=", true);
        alphabets.put("c-", true);
        alphabets.put("dz=", true);
        alphabets.put("d-", true);
        alphabets.put("lj", true);
        alphabets.put("nj", true);
        alphabets.put("s=", true);
        alphabets.put("z=", true);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int count = 0;

        boolean continueFlag = false;
        int continueCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (continueFlag) {
                if (continueCount != 0) {
                    continueCount--;
                    continue;
                } else {
                    continueFlag = false;
                }
            }

            if ((i + 1) == s.length()) {
                count++;
                break;
            }

            if ((i + 1) > s.length()) {
                break;
            }

            if (s.charAt(i) == 'd' && ((i+2) <= s.length() - 1)) {
                if (s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                    continueFlag = true;
                    count++;
                    continueCount = 2;
                    continue;
                }
            }

            String s2 = new String(new char[]{s.charAt(i), s.charAt(i + 1)});

            if (alphabets.containsKey(s2)) {
                count++;
                continueCount = 1;
                continueFlag = true;
                continue;
            }

            count++;
        }

        System.out.println(count);
    }
}
