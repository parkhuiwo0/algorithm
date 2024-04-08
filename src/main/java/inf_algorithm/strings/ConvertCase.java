package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strings = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length(); i++) {
            char charAt = strings.charAt(i);
            if (charAt >= 97) {
                sb.append(Character.toUpperCase(charAt));
            } else {
                sb.append(Character.toLowerCase(charAt));
            }
        }

        System.out.println(sb);
    }
}
