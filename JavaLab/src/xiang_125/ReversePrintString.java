package xiang_125;

public class ReversePrintString {
	public static void main(String[] args) {
		f1(3, "abcd");
	}

	public static void f(int n, String str) {
		if (n == str.length()) {
			return;
		}
		f(n + 1, str);
		System.out.println(str.charAt(n));
	}

	public static void f1(int n, String str) {
		if (n < 0) {
			return;
		}
		System.out.println(str.charAt(n));
		f1(n - 1, str);
	}
}
