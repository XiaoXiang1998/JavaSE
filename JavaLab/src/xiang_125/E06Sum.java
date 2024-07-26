package xiang_125;

public class E06Sum {

	// f(n)=f(n-1)+n
	public static long sum(long n) {
		if (n == 1) {
			return 1;
		}

		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		long n = 1000000;
		long sum = 0;
		for (long i = n; i >= 1; i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}
