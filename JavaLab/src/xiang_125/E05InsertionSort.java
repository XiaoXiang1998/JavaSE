package xiang_125;

import java.util.Arrays;

public class E05InsertionSort {
	public static void sort(int[] a) {
		insertion(a, 1); // 可以認為0區域內元素排好序 從1開始
	}

	private static void insertion(int[] a, int low) {
		if (low == a.length) {
			return;
		}

		int t = a[low]; // 未排序區域的左邊界

		int i = low - 1;// 已排序區域指針

		while (i >= 0 && a[i] > t) { // 沒有找到插入位置 不斷循環
			a[i + 1] = a[i]; // 空出插入位置
			i--;
		}

		// 找到插入位置
		if (i + 1 != low) {
			a[i + 1] = t;
		}
		insertion(a, low + 1);
	}

	// 另一種插入排序的實現
	private static void insertion2(int[] a, int low) {
		if (low == a.length) {
			return;
		}

		int i = low - 1;
		while (i >= 0 && a[i] > a[i + 1]) { // 沒有找到插入位置 不斷循環
			int t = a[i];
			a[i] = a[i + 1];
			a[i + 1] = t;
			i--;

		}
		insertion(a, low + 1);
	}

	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 6, 7, 9 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
