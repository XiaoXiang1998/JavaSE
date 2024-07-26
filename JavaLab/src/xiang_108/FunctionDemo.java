package xiang_108;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
//		convert("100", (String s) -> {
//			return Integer.parseInt(s);
//		});

		convert("100", s -> Integer.parseInt(s));
//		convert("100", Integer::parseInt);

		convert(100, i -> String.valueOf(i + 566));

		convert("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 566));
	}

	// 定義一個方法,把一個字符串轉為int類型,在控制台輸出
	private static void convert(String s, Function<String, Integer> fun) {

//		Integer i = fun.apply(s);
		int i = fun.apply(s);
		System.out.println(i);
	}

	// 定義一個方法,把一個int類型的數據加上一個整數,轉為字符串在控制台輸出
	private static void convert(int i, Function<Integer, String> fun) {

		String s = fun.apply(i);
		System.out.println(s);
	}

	// 定義一個方法,把一個字符串轉換int類型,把int類型的數據加上一個整數之後,轉為字符串在控制台輸出
	private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {

//		Integer i = fun1.apply(s);
//		String ss = fun2.apply(i);
//		System.out.println(ss);
		String ss = fun1.andThen(fun2).apply(s);
		System.out.println(ss);
	}
}
