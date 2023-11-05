package io.github.parkhuiwo0.impl.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27889 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        }
        if (s.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        }
        if (s.equals("KIS")) {
            System.out.println("Korea International School");
        }
        if (s.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}
