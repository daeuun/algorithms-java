package dynamicprogramming;

public class fibonacci {
    public static int fibo(int x) {
        if (x == 1 || x == 2) { // 맨앞에 두 수라면 return
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2); // 바로 앞, 두칸 앞의 수를 더한다
    }

    public static void main(String[] args) {
        System.out.print(fibo(5));
    }
}
