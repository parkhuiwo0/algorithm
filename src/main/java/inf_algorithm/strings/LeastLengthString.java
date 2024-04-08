package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastLengthString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] charArray = st.nextToken().toCharArray();
        char findChar = st.nextToken().charAt(0);

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == findChar) {
                System.out.print(0 + " ");
                continue;
            }

            System.out.print(getShortDistance(charArray, i, findChar));
            if (i < charArray.length) {
                System.out.print(" ");
            }
        }
    }

    static int getShortDistance(char[] charArr, int position, char findChar) {
        int shortDistance = Integer.MAX_VALUE;

        if (position < charArr.length - 1) {
            int distance = 0;
            for (int i = position + 1; i < charArr.length; i++) {
                distance++;
                if (charArr[i] == findChar) {
                    if (shortDistance > distance) {
                        shortDistance = distance;
                    }
                    break;
                }
            }
        }

        if (position - 1>= 0) {
            int distance = 0;
            for (int i = position - 1; i >= 0; i--) {
                distance++;
                if (charArr[i] == findChar) {
                    if (shortDistance > distance) {
                        shortDistance = distance;
                    }
                    break;
                }
            }
        }

        return shortDistance;
    }
}
