package inf_algorithm.map_set_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ClassKing_Hash {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String vote = br.readLine();

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            Character c = vote.charAt(i);
            Integer voteCount = countMap.putIfAbsent(c, 1);
            if (voteCount != null) {
                countMap.put(c, voteCount + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        Character winner = null;
        for (Character character : countMap.keySet()) {
            Integer integer = countMap.get(character);

            if (integer > max) {
                winner = character;
                max = integer;
            }
        }
        System.out.println(winner);
    }
}
