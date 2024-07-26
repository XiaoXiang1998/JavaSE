package xiang_126;

//遞迴楊輝三角
public class E03PascalTriangle {
	// 直接遞迴 未優化
	// Params:i-列座標 j-行座標 Returns:該座標元素值

	private static int element(int i, int j) {
		if (j == 0 || i == j) {
			return 1;
		}
		return element(i - 1, j - 1) + element(i - 1, j);
	}

	private static void printSpace(int n, int i) {
		int num = (n - 1 - i) * 2;

		for (int j = 0; j < num; j++) {
			System.out.print(" ");
		}
	}

	// 高度
	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			printSpace(n, i);
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-4d", element(i, j));
			}
			System.out.println();
		}
	}

	private static int element1(int[][] triangle, int i, int j) {
		if (triangle[i][j] > 0) {
			return triangle[i][j];
		}

		if (j == 0 || i == j) {
			triangle[i][j] = 1;
			return 1;
		}
		triangle[i][j] = element1(triangle, i - 1, j - 1) + element1(triangle, i - 1, j);
		return triangle[i][j];
	}

	public static void print1(int n) {
		int[][] triangle = new int[n][];
		for (int i = 0; i < n; i++) { // 列
			triangle[i] = new int[i + 1];
			// printSpace(n, i);
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-4d", element1(triangle, i, j));
			}
			System.out.println();
		}
	}

	/*
	 * 
	 * <h3>優化2 使用一維數組記憶法</h3>
	 */
	/*
	 * 0 0 0 0 0 0 初始狀態 1 0 0 0 0 0 i=0 1 1 0 0 0 0 i=1 1 2 1 0 0 0 i=2 1 3 3 1 0 0
	 * i=3 1 4 6 4 1 0 i=4 *
	 */
	private static void createRow(int[] row, int i) {
		if (i == 0) {
			row[0] = 1;
			return;
		}
		for (int j = i; j > 0; j--) {
			row[j] = row[j] + row[j - 1];
		}
	}

	public static void print2(int n) {
		int[] row = new int[n];
		for (int i = 0; i < n; i++) { // 列
			createRow(row, i);
			// printSpace(n, i);
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-4d", row[j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print2(10);
	}
}