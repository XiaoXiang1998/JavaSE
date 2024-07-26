package xiang_123;

public class TestCacheLine {
	// 性能較好
	public static void ij(int[][] a, int rows, int columns) {
		long sum = 0L;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}

	public static void ji(int[][] a, int rows, int columns) {
		long sum = 0L;
		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

	}

}
