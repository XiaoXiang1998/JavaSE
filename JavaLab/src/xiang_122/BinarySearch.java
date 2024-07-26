package xiang_122;

public class BinarySearch {

	public static void main(String[] args) {
		int[] binary = { 3, 4, 4, 5, 5, 7, 8, 9, 10 };
		int binarySearchBasic = binarySearchLeftmost2(binary, 6);
		System.out.println(binarySearchBasic);
	}

	/*
	 * 二分查找基礎版 Params:a-待查找的升序數組 target-待查找的目標值 Returns: 找到澤返回索引 找不到返回-1
	 */
	public static int binarySearchBasic(int[] a, int target) {
		int i = 0, j = a.length - 1; // 設置指針和初值
		// L次 元素在最左邊 L次 , 元素在最右邊2*L次
		while (i <= j) { // 範圍內有東西
			// int m = (i + j) / 2; J如果是最大值會OVERFLOW
			int m = (i + j) >>> 1;
			if (target < a[m]) { // 目標在中間值左邊
				j = m - 1;
			} else if (a[m] < target) { // 目標在中間值右邊
				i = m + 1;
			} else {
				return m; // 找到了
			}
		}
		return -1;
	}

	/*
	 * 二分查找改動版 Params:a-待查找的升序數組 target-待查找的目標值 Returns: 找到澤返回索引 找不到返回-1
	 */
	public static int binarySearchAlternative(int[] a, int target) {
		int i = 0, j = a.length;// 第一處
		while (i < j) { // 第二處
			// int m = (i + j) / 2; J如果是最大值會OVERFLOW
			int m = (i + j) >>> 1;
			if (target < a[m]) {
				j = m; // 第三處
			} else if (a[m] < target) {
				i = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

	public static int binarySearch3(int[] a, int target) {
		int i = 0, j = a.length;
		while (1 < j - i) {
			int m = (i + j) >>> 1;
			if (target < a[m]) {
				j = m;
			} else {
				i = m;
			}
		}
		if (a[i] == target) {
			return i;
		}
		return -1;
	}

	public static int binarySearchLeftmost1(int[] a, int target) {
		int i = 0, j = a.length - 1;
		int candidate = -1;
		while (i <= j) {
			int m = (i + j) >>> 1;
			if (target < a[m]) {
				j = m - 1;
			} else if (a[m] < target) {
				i = m + 1;
			} else {
				// 紀錄候選位置
				candidate = m;
				j = m - 1;
			}
		}
		return candidate;
	}

	public static int binarySearchRightmost1(int[] a, int target) {
		int i = 0, j = a.length - 1;
		int candidate = -1;
		while (i <= j) {
			int m = (i + j) >>> 1;
			if (target < a[m]) {
				j = m - 1;
			} else if (a[m] < target) {
				i = m + 1;
			} else {
				// 紀錄候選位置
				candidate = m;
				i = m + 1;
			}
		}
		return candidate;
	}

	/*
	 * Params:a-待查找的升序數組 target-待查找的目標值 Returns:返回>=target的最靠左索引
	 */
	public static int binarySearchLeftmost2(int[] a, int target) {
		int i = 0, j = a.length - 1;
		while (i <= j) {
			int m = (i + j) >>> 1;
			if (target <= a[m]) {
				j = m - 1;
			} else {
				i = m + 1;
			}
		}
		return i;
	}

	/*
	 * Params:a-待查找的升序數組 target-待查找的目標值 Returns:返回<=target的最靠右索引
	 */
	public static int binarySearchRightmost2(int[] a, int target) {
		int i = 0, j = a.length - 1;
		while (i <= j) {
			int m = (i + j) >>> 1;
			if (target < a[m]) {
				j = m - 1;
			} else {

				i = m + 1;
			}
		}
		return i - 1;
	}
}
