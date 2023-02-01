package dynamicprogramming.lis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soldier {
    static  int n;
    static ArrayList<Integer> v = new ArrayList<Integer>();
    static int[] dp = new int[200];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }
        // 전체 병사의 순서를 뒤집어 최장 증가 부분 수열 문제로 변환
        Collections.reverse(v);
        // DP 초기화
        for (int i = 0; i < n; i++) dp[i] = 1;
        // 가장 긴 증가하는 부분 수열 LIS
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (v.get(j) < v.get(i)) dp[i] = Math.max(dp[i], dp[j] + 1); // 자기보다 해당 원소 작은 경우 테이블 갱신
        // 열외해야 하는 병사 최소 수
        int maxValue = 0;
        for (int i = 0; i < n; i++) maxValue = Math.max(maxValue, dp[i]);
        System.out.println(n - maxValue);
    }
}
