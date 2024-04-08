package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPalindromeWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        boolean isPalindrome = true;

        for (int i = 0; i < charArray.length / 2; i++) {
            char c = Character.toLowerCase(charArray[i]);
            char c2 = Character.toLowerCase(charArray[charArray.length - 1 - i]);

            if (c != c2) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
