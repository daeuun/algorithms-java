package sorting.selectingsort;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {6, 3, 4, 9, 2, 5, 7, 1, 8, 0};

        for(int i = 0; i < n; i++) {
            int min_idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }

            // 바꾸고 싶은 두 원소의 위치값 swipe
            int temp = arr[i]; // 임시로 위치값 담아놓음
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
