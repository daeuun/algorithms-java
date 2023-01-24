package dynamicprogramming.memoization.bottomup;

public class fibo {

    // bottomup : 작은 문제부터 해결하는 방법
    public static long[] d = new long[100]; // 계산된 결과 저장하는 dp 테이블

    public static void main(String[] args) {
        // 첫번째, 두번째 피보나치 수 = 1
        d[1] = 1;
        d[2] = 1;
        int n = 50; // 50번째 계산

        for (int i = 3; i <=n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }
}
