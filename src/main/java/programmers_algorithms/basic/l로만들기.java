package programmers_algorithms.basic;

public class l로만들기 {
    public static void main(String[] args) {

    }

    public static String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c <= 'l') {
                answer.append("l");
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
