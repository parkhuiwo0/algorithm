package inf_algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        for (char c : charArray) {
            linkedHashSet.add(String.valueOf(c));
        }

        for (String s : linkedHashSet) {
            System.out.print(s);
        }
    }
}
