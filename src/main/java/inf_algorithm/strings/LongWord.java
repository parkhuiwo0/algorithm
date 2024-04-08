package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = st.countTokens();

        String[] wordArr = new String[count];

        for (int i = 0; i < count; i++) {
            wordArr[i] = st.nextToken();
        }

        int maxLength = Integer.MIN_VALUE;
        int maxLengthIdx = 0;

        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].length() > maxLength) {
                maxLength = wordArr[i].length();
                maxLengthIdx = i;
            }
        }

        System.out.println(wordArr[maxLengthIdx]);
    }
}
