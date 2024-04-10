package inf_algorithm.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RemoveBracketWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                stack.pop();
                continue;
            }

            if (!stack.isEmpty()) {
              continue;
            }

            System.out.print(c);
        }
    }
}
