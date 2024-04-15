package math;

public class 약수 {
    public static void main(String[] args) {
        int N = 1000000000;

        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (i * i == N) count++;
            else if (N % i == 0) count += 2;
        }

        System.out.println(count);
    }
}
