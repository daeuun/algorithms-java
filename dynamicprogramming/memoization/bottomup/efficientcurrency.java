package dynamicprogramming.memoization.bottomup;

import java.util.Arrays;
import java.util.Scanner;

public class efficientcurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // N개의 화폐 단위 정보 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 0~m원 (DP 테이블 초기화)
        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        // DP : bottomup
        for (int i = 0; i < n; i++) { // 화폐단위
            for (int j = arr[i]; j <= m; j++) { // 금액
                if (d[j - arr[i]] != 10001) // i-k 원 만드는 방법 존재하는 경우
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
            }
        }
        if (d[m] == 10001) System.out.println(-1);
        else System.out.println(d[m]);
    }
}
