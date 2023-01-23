package sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
        }

        Integer[] b = new Integer[n];
        for (int i= 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a); // 오름차순
        Arrays.sort(b, Collections.reverseOrder()); // 내림차순

        // 두 배열 k번 비교
        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }

        // a 모든 원소 합 구하기
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }

        System.out.print(result);
    }
}
