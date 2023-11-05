package io.github.parkhuiwo0.binarysearch.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2512 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] moneys = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for (int i = 0; i < count; i++) {
            moneys[i] = Integer.parseInt(st.nextToken());
            sum += moneys[i];
        }

        int totalMoney = Integer.parseInt(br.readLine());

        Arrays.sort(moneys);

        if (isAvailable(sum, totalMoney)) {
            System.out.println(moneys[count - 1]);
            return;
        }

        // solve
        int maxAvailableMoney = getMaxAvailableMoney(totalMoney, moneys);

        System.out.println(maxAvailableMoney);
    }

    static boolean isAvailable(int requestMoney, int totalMoney) {
        return totalMoney >= requestMoney;
    }

    static int getMaxAvailableMoney(int totalMoney, int[] requestMoneys) {
        int startMoney = 0;
        int endMoney = requestMoneys[requestMoneys.length - 1];
        int mid = (startMoney + endMoney) / 2;

        while (startMoney <= endMoney) {
             mid = (startMoney + endMoney) / 2;

             int temp = 0;
            for (int i = 0; i < requestMoneys.length; i++) {
                if (requestMoneys[i] > mid) {
                    temp += mid;
                } else {
                    temp += requestMoneys[i];
                }
            }

            if (temp <= totalMoney) {
                startMoney = mid + 1;
            } else {
                endMoney = mid - 1;
            }
        }

        return endMoney;
    }
}
