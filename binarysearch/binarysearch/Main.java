package binarysearch.binarysearch;

import java.util.Scanner;

public class Main {

    // 이진탐색 (반복문)
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid; // 찾으면 중간값 반환
            else if (arr[mid] > target) end = mid -1; // 중간값 보다 찾는게 작으면 왼쪽 확인
            else start = mid + 1; // 중간값 보다 찾는게 크면 오른쪽 확인
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n : 원소의 개수, target : 찾는 값
        int n = sc.nextInt();
        int target = sc.nextInt();

        // 전체 원소 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr, target, 0, n -1);
        if (result == -1) {
            System.out.print("원소가 존재하지 않습니다.");
        }
        else {
            System.out.print(result);
        }
    }
}
