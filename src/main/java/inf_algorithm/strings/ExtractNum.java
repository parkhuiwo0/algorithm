package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }
}
