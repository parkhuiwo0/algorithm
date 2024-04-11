package programmers_algorithms.basic;

public class 배열의원소만큼출력하기 {
    public static void main(String[] args) {
        int arr[] = {5,1,4};

        int[] solution = solution(arr);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);;
        }
    }

    public static int[] solution(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr[i] * 1;
        }

        int[] answer = new int[size];

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (int j = 0; j < n; j++) {
                answer[cnt] = n;
                cnt++;
            }
        }

        return answer;
    }
}
