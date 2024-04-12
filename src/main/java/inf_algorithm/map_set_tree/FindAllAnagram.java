package inf_algorithm.map_set_tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindAllAnagram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();

        int lt=0, rt = s2.length(), cnt = 0;
        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            char c2 = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
            m2.put(c2, m2.getOrDefault(c2, 0) + 1);
        }

        while (rt < s.length() - -1) {
            if (check(m, m2)) {
                cnt++;
            }

            if (rt == s.length()) {
                break;
            }

            char ltChar = s.charAt(lt++);
            Integer ltVal = m2.get(ltChar);
            if (ltVal != null) {
                if (ltVal == 1) {
                    m2.remove(ltChar);
                } else {
                    m2.put(ltChar, ltVal - 1);
                }
            }
            char rtChar = s.charAt(rt++);
            m2.put(rtChar, m2.getOrDefault(rtChar, 0) + 1);
        }

        System.out.println(cnt);
    }

    public static boolean check(Map<Character, Integer> m, Map<Character, Integer> m2) {
        for (Character c : m2.keySet()) {
            Integer i = m.get(c);
            if (i == null) {
                return false;
            }

            if (!i.equals(m2.get(c))) {
                return false;
            }
        }

        return true;
    }
}
