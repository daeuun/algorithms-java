package sorting.quicksort;

public class Main {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개면 리턴
        int pivot = start;
        int left = start + 1;
        int right = end;
        while (left <= right) {
            // 왼쪽에서 pivot 보다 큰 데이터 찾기
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 오른쪽에서 pivot 보다 작은 데이터 찾기
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 pivot 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else {
                // 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽, 오른쪽에서 각각 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {6, 3, 4, 9, 2, 5, 7, 1, 8, 0};

        quickSort(arr, 0, n -1);
    }

}
