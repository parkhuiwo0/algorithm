package io.github.parkhuiwo0.impl;

import io.github.parkhuiwo0.difficulty.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Bronze
public class Problem1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int players = Integer.parseInt(br.readLine());
        Map<Character, Integer> firstNameCountMap = new HashMap<>();

        for (int i = 0; i < players; i++) {
            final char charAt = br.readLine().charAt(0);
            if (firstNameCountMap.containsKey(charAt)) {
                Integer integer = firstNameCountMap.get(charAt);
                firstNameCountMap.put(charAt, Integer.valueOf(integer.intValue() + 1));
            } else {
                firstNameCountMap.put(charAt, 1);
            }
        }

        boolean isSurrender = true;

        ArrayList<Character> arrayList = new ArrayList<>();
        for (Character character : firstNameCountMap.keySet()) {
            final Integer integer = firstNameCountMap.get(character);
            if (integer >= 5) {
                isSurrender = false;
                arrayList.add(character);
            }
        }

        if (isSurrender) {
            System.out.println("PREDAJA");
            return;
        }

        Arrays.sort(new ArrayList[]{arrayList});

        for (Character character : arrayList) {
            System.out.print(character);
        }
    }
}
