package programmers_algorithms.basic;

public class 세로읽기 {
    public static void main(String[] args) {
        String s = solution("ihrhbakrfpndopljhygc", 4, 2);
        System.out.println(s);
    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int height = my_string.length() / m;
        char[][] arr = new char[height][m];

        int cIdx = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(cIdx++);
            }
        }

        for (int i = 0; i < height; i++) {
            sb.append(arr[i][c-1]);
        }
        return sb.toString();
    }
}
