package io.github.parkhuiwo0.impl.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem25206 {

    /*
        (학점*과목평점)/학점
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Float> scoreMap = new HashMap<>();
        scoreMap.put("A+", 4.5f);
        scoreMap.put("A0", 4.0f);
        scoreMap.put("B+", 3.5f);
        scoreMap.put("B0", 3.0f);
        scoreMap.put("C+", 2.5f);
        scoreMap.put("C0", 2.0f);
        scoreMap.put("D+", 1.5f);
        scoreMap.put("D0", 1.0f);
        scoreMap.put("F", 0.0f);

        float totalScore = 0.0f;
        float totalCredit = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            float credit = Float.parseFloat(st.nextToken());
            String score = st.nextToken();

            if (score.equals("P")) {
                continue;
            }

            totalScore += scoreMap.get(score) * credit;
            totalCredit += credit;
        }

        System.out.printf("%.6f", (totalScore / totalCredit));
    }

}
