package sorting.insertingsort;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {6, 3, 4, 9, 2, 5, 7, 1, 8, 0};
        for(int i = 1; i < n; i++) {
            // i -> 1까지 감소시키기
            for(int j = i; j >0; j--) {
                // 왼쪽으로 이동
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break; // 작은 데이터 만나면 브레이
            }

        }
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
