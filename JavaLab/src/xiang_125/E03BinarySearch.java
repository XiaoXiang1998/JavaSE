package xiang_125;

public class E03BinarySearch {

	public static int search(int[] a, int target) {
		return f(a, target, 0, a.length - 1);
	}

	/*
	 * 遞歸(子問題)函數
	 * 
	 * Params:a-數組 target-待查找值 i-起始索引(包含) j-結束索引(包含
	 * 
	 * Returns: 找到返回索引,找不到返回-1
	 * 
	 */
	private static int f(int[] a, int target, int i, int j) {
		if (i > j) {
			return -1;
		}

		int m = (i + j) >>> 1;
		if (target < a[m]) {
			return f(a, target, i, m - 1);
		} else if (a[m] < target) {
			return f(a, target, m + 1, j);
		} else {
			return m;
		}
	}

	public static void main(String[] args) {
		int[] a = { 7, 13, 21, 30, 38, 44 };
		int search = search(a, 30);
		System.out.println(search);
	}
}
