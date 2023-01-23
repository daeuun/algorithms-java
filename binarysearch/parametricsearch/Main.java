package binarysearch.parametricsearch;

import java.util.Scanner;

public class Main {

    // 큰 탐색 범위 문제 => 이진 탐색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 떡의 개수
        int m = sc.nextInt(); // 요청한 떡의 길이

        // 각각의 떡의 높이 배열
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진탐색 시작점, 끝점 설정
        int start = 0;
        int end = (int) 1e9; // 가장 큰 값 10억

        // 이진탐색 수행
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // 잘랐을 때 떡의 양 계산
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) { // 떡이 부족하면 더 많이 자르기 (왼쪽 탐색)
                end = mid - 1;
            }
            else { // 떡이 충분하면 덜 자르기 (오른쪽 탐색)
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
