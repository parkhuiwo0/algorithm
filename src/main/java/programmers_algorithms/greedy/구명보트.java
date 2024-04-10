package programmers_algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 구명보트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = Integer.parseInt(st2.nextToken());
        }

        int solution = solution(people, l);
        System.out.println(solution);
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int cnt = 0, rt = people.length-1, lt = 0;

        while (cnt < people.length) {
            int w = people[rt--];

            int w2 = people[lt];
            if (w + w2 <= limit) {
                cnt += 2;
                lt++;
            } else {
                cnt += 1;
            }
            answer++;
        }

        return answer;
    }
}
