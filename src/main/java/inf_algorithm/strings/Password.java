package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordCount = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();

        int count = 1;

        for (int i = 0; i < wordCount; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 7; j++) {
                char c = charArray[i * 7 + j];
                if (c == '#') {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }

            System.out.print((char) Integer.parseInt(sb.toString(), 2));
        }
    }
}
