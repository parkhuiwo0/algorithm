package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strings = br.readLine().toLowerCase();
        char[] character = br.readLine().toLowerCase().toCharArray();

        if (character.length > 1) {
            throw new RuntimeException();
        }

        char findChar = character[0];

        int count = 0;

        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == findChar) {
                count++;
            }
        }

        System.out.println(count);
    }
}
