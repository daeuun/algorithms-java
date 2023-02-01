package dynamicprogramming.memoization.bottomup;

import java.util.Scanner;

public class makeone {
    public static int[] d = new int[30001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // DP : bottomup (1은 자기자신 그대로, find the optimal solution about 2 ~ input value)
        // 가장 적은 값을 골라서 1 더하기 => 1 만들기
        for (int i = 2; i <= x; i++) {
            // 현재 수에서 1을 빼는 경우
            d[i] = d[i - 1] + 1;
            // 현재 수가 2로 나누어 떨어지는 경우
            if (i % 2 == 0)
                d[i] = Math.min(d[i], d[i / 2] + 1);
            // 현재 수가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0)
                d[i] = Math.min(d[i], d[i / 3] + 1);
            // 현재 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0)
                d[i] = Math.min(d[i], d[i / 5] + 1);
        }
        System.out.println(d[x]);
    }
}
