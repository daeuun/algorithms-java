package dynamicprogramming.memoization.topdown;

public class fibo {
    public static long[] d = new long[100]; // momoziation 배열

    public static long fibo(int x) {
        System.out.print("f(" + x + ") "); // 시간복잡도 O(N) : f(6) f(5) f(4) f(3) f(2) f(1) f(2) f(3) f(4)
        if (x == 1 || x == 2) return 1;
        else if (d[x] != 0) return d[x]; // 메모된 값 return

        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }

    public static void main(String[] args) {
        fibo(6);
    }
}
