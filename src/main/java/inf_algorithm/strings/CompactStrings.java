package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompactStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        int count = 1;
        char before = charArray[0];

        for (int i = 1; i < charArray.length; i++) {
            char c = charArray[i];

            if (before == c) {
                count++;
            } else {
                if (count == 1) {
                    System.out.print(before);
                } else {
                    System.out.print(before+""+count);
                }
                count=1;
                before=c;
            }
        }
        if (count == 1) {
            System.out.print(before);
        } else {
            System.out.print(before+""+count);
        }
    }
}
