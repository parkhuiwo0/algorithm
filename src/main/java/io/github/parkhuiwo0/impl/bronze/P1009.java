package io.github.parkhuiwo0.impl.bronze;

import java.io.IOException;
import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int a,b,r;
        for(int j = 0; j < T; j++) {
            a=s.nextInt();
            b=s.nextInt();
            r=1;

            for (int i = 0; i < b; i++) {
                r = (r * a) % 10;
            }
            if(r==0) r=10;
            System.out.println(r);
        }
        s.close();
    }
}
