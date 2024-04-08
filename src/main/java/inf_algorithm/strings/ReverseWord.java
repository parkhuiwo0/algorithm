package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            char[] charArray = br.readLine().toCharArray();

            for (int j = charArray.length - 1; j >= 0; j--) {
                System.out.print(charArray[j]);
            }
            System.out.println("");
        }
    }
}
