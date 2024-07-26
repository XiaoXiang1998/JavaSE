package xiang_125;

import java.util.Arrays;

public class E06Fibonacci {

	// 使用Memoization 記憶法,也稱備忘錄 改進
	// Params: n-第n項
	// Returns:第n項的值
	public static long fibonacci(int n) {

		long[] cache = new long[n + 1];
		Arrays.fill(cache, -1); // [-1,-1,-1,-1,-1,-1]
		cache[0] = 0;
		cache[1] = 1; // [0,1,-1,-1,-1,-1]
		return f(n, cache);
	}

	public static long f(int n, long[] cache) {

		if (cache[n] != -1) {
			return cache[n];
		}

		long x = f(n - 1, cache);
		long y = f(n - 2, cache);
		cache[n] = x + y; // [0,1,?,-1,-1,-1] //存入數組
		return cache[n];
	}

	public static void main(String[] args) {
		long f = fibonacci(100);
		System.out.println(f);
	}
}
