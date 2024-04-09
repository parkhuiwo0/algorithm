package inf_algorithm.map_set_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String s2 = br.readLine();

        if (s.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = s2.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }

        boolean isAnagram = true;

        for (Character c : map.keySet()) {
            if (!Objects.equals(map.get(c), map2.get(c))) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "YES" : "NO");
    }
}
