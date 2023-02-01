package dynamicprogramming.memoization.bottomup;

import java.util.Scanner;

public class goldmine {
    static int testCase, n, m;
    static int[][] arr = new int[20][20];
    static int[][] dp = new int[20][20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        testCase = sc.nextInt();
        // list 벗어나는지
        for (int tc = 0; tc < testCase; tc++) {
            // 금광 정보
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; i < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // DP 초기화
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = arr[i][j];
                }
            }
            // DP : bottomup
            for (int j = 1; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    int leftUp, leftDown, left;
                    // 왼쪽 위에서 옴
                    if (i == 0) leftUp = 0;
                    else leftUp = dp[i -1][j -1];
                    // 왼쪽 아래에서 옴
                    if (i == n - 1) leftDown = 0;
                    else leftDown = dp[i + 1][j -1];
                    // 왼쪽에서 옴
                    left = dp[i][j -1];
                    dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(leftDown, left));
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(result, dp[i][m - 1]);
            }
            System.out.println(result);
        }

    }
}
