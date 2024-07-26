package xiang_105;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		// 定義一個數組
		int[] arr = { 19, 50, 28, 37, 46 };

		int maxvalue = gexMax(() -> {
			int max = arr[0];

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		});
		System.out.println(maxvalue);
	}

	// 返回一個數組的最大值
	private static int gexMax(Supplier<Integer> sup) {
		return sup.get();
	}
}
