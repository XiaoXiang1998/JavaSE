package xiang_122;

import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = { 2, 5, 8 };
		int target = 4;

		int i = Arrays.binarySearch(a, target);
		System.out.println(i);

		if (i < 0) {
			int insertIndex = Math.abs(i + 1); // 插入點索引
			System.out.println(insertIndex);
			int[] b = new int[a.length + 1];
			System.arraycopy(a, 0, b, 0, insertIndex);
			System.out.println(Arrays.toString(b));
			b[insertIndex] = target;
			System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
			System.out.println(Arrays.toString(b));
		}
	}
}
