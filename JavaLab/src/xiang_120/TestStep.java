package xiang_120;

public class TestStep {

	public static void main(String[] args) {
		TestStep t = new TestStep();
		int f = t.f(0);
		System.out.println(f);
	}

	// 實現f(n):求n步台階,一共有幾種走法
	public int f(int n) {

		if (n < 1) {
			throw new IllegalArgumentException("請輸入包含1以上的整數");
		}

		if (n == 1 || n == 2) {
			return n;
		}
		return f(n - 2) + f(n - 1);
	}

}
