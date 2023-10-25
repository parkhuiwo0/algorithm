package io.github.parkhuiwo0.impl.silver;

import io.github.parkhuiwo0.Failed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


/**
 * 2,4,4,2,8
 * 2,
 * 10,
 * 8,2,6,2,2
 */

/**
 * https://www.acmicpc.net/problem/2037.
 */
@Failed(description = "반례를 못 찾겠음;;")
public class Problem2037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final StringTokenizer initInput = new StringTokenizer(br.readLine());
        final int inputLatency = Integer.parseInt(initInput.nextToken());
        final int sameKeyWaitTime = Integer.parseInt(initInput.nextToken());

        final char[] keys = br.readLine().toCharArray();
        Map<Character, KeySequenceWrapper> keyboardMap = init();
        int totalTime = 0;
        boolean isBeforeInputBlank = false;
        int beforeKey = 999;

        for (char key : keys) {
            final KeySequenceWrapper keySequence = keyboardMap.get(key);
            if (keySequence.getKey() == 1 && !isBeforeInputBlank) { // 공백 처리
                beforeKey = keySequence.getKey();
                totalTime += keySequence.getSequence() * 2;
                isBeforeInputBlank = true;
                continue;
            }

            if (keySequence.getKey() == beforeKey) {
                totalTime += sameKeyWaitTime;
            }

            totalTime += inputLatency * keySequence.getSequence();
            isBeforeInputBlank = false;
            beforeKey = keySequence.getKey();

        }

        System.out.println(totalTime);
    }

    static Map<Character, KeySequenceWrapper> init() {
        Map<Character, KeySequenceWrapper> keyboardMap = new HashMap<>();
        keyboardMap.put(' ', new KeySequenceWrapper(1, 1));

        keyboardMap.put('A', new KeySequenceWrapper(2, 1));
        keyboardMap.put('D', new KeySequenceWrapper(3, 1));
        keyboardMap.put('G', new KeySequenceWrapper(4, 1));
        keyboardMap.put('J', new KeySequenceWrapper(5, 1));
        keyboardMap.put('M', new KeySequenceWrapper(6, 1));
        keyboardMap.put('P', new KeySequenceWrapper(7, 1));
        keyboardMap.put('T', new KeySequenceWrapper(8, 1));
        keyboardMap.put('W', new KeySequenceWrapper(9, 1));

        keyboardMap.put('B', new KeySequenceWrapper(2, 2));
        keyboardMap.put('E', new KeySequenceWrapper(3, 2));
        keyboardMap.put('H', new KeySequenceWrapper(4, 2));
        keyboardMap.put('K', new KeySequenceWrapper(5, 2));
        keyboardMap.put('N', new KeySequenceWrapper(6, 2));
        keyboardMap.put('Q', new KeySequenceWrapper(7, 2));
        keyboardMap.put('U', new KeySequenceWrapper(8, 2));
        keyboardMap.put('X', new KeySequenceWrapper(9, 2));

        keyboardMap.put('C', new KeySequenceWrapper(2, 3));
        keyboardMap.put('F', new KeySequenceWrapper(3, 3));
        keyboardMap.put('I', new KeySequenceWrapper(4, 3));
        keyboardMap.put('L', new KeySequenceWrapper(5, 3));
        keyboardMap.put('O', new KeySequenceWrapper(6, 3));
        keyboardMap.put('R', new KeySequenceWrapper(7, 3));
        keyboardMap.put('V', new KeySequenceWrapper(8, 3));
        keyboardMap.put('Y', new KeySequenceWrapper(9, 3));

        keyboardMap.put('S', new KeySequenceWrapper(7, 4));
        keyboardMap.put('Z', new KeySequenceWrapper(9, 4));

        return keyboardMap;
    }


    static class KeySequenceWrapper {
        final Integer key;
        final Integer sequence;

        KeySequenceWrapper(Integer key, Integer sequence) {
            this.key = key;
            this.sequence = sequence;
        }

        public Integer getKey() {
            return key;
        }

        public Integer getSequence() {
            return sequence;
        }
    }
}
