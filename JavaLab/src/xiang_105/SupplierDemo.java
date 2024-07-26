package xiang_105;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
//		String s = getString(() -> {
//			return "林青霞";
//		});
		String s = getString(() -> "林青霞");
		System.out.println(s);

		Integer i = getInteger(() -> 10);
		System.out.println(i);
	}

	// 定義一個方法,返回一個整數數據
	private static Integer getInteger(Supplier<Integer> sup) {
		return sup.get();
	}

	// 定義一個方法,返回一個字符串數據
	private static String getString(Supplier<String> sup) {
		return sup.get();
	}
}
