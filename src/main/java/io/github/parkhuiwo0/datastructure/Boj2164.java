package io.github.parkhuiwo0.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        boolean poll = true;
        while (queue.size() > 1) {
            if (poll) {
                queue.poll();
                poll = false;
            } else {
                queue.add(queue.poll());
                poll = true;
            }
        }

        System.out.println(queue.poll());
    }
}
