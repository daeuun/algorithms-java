package sorting.countingsort;

public class Main {
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        int[] arr = {1, 6, 3, 5, 0, 4, 9, 2, 4, 5, 7, 1, 9, 8, 0};
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1; // 각 데이터에 해당하는 인덱스 값 증가
        }

        for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 각 인덱스 확인
            for (int j = 0; j < cnt[i]; j++) { // 인덱스의 카운트 확인
                System.out.print(i + " ");
            }
        }
    }
}
