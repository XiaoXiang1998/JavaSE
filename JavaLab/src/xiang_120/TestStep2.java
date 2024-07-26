package xiang_120;

public class TestStep2 {

	public static void main(String[] args) {
		TestStep2 t2 = new TestStep2();
		System.out.println(t2.loop(4));
	}

	// 實現f(n):求n步台階,一共有幾種走法
	public int loop(int n) {

		if (n < 1) {
			throw new IllegalArgumentException("請輸入包含1以上的整數");
		}

		if (n == 1 || n == 2) {
			return n;
		}

		int one = 2; // 走到第二級台階的走法
		int two = 1; // 走到第一級台階的走法

		int sum = 0;

		for (int i = 3; i <= n; i++) {
			// 最後跨兩步+最後跨一步的走法
			sum = two + one;
			two = one;
			one = sum;
		}
		return sum;
	}

}
