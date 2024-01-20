package io.github.parkhuiwo0.bruteforce.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardCount = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());

        int[] cards = new int[cardCount];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < cardCount; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }

        int answer = 0;

        /**
         * 5,6,7,8,9
         */

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if (temp <= number && answer < temp) {
                        answer = temp;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
