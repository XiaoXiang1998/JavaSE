package xiang_118;

public class Test {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int n = 5;
		for (int j = 1; j <= n; j++) {
			for (int x = 1; x <= n - j; x++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			for (int k = 1; k <= j - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
