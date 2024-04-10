package inf_algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectBracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int l=0, r=0;
        boolean isBreak = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && c == ')') {
                isBreak = true;
                break;
            }
            if (i == s.length() - 1 && c == '(') {
                isBreak = true;
                break;
            }

            if (c == '(') {
                l++;
            }
            if (c == ')') {
                r++;
                l--;
            }
        }
        System.out.println(l == 0 && !isBreak ? "YES" : "NO");
    }
}
