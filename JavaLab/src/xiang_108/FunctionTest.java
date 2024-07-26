package xiang_108;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		String s = "林青霞,30";

//		convert(s, (String ss) -> {
//			return s.split(",")[1];
//		}, (String ss) -> {
//			return Integer.parseInt(ss);
//		}, (Integer i) -> {
//			return i + 70;
//		});

//		convert(s, ss -> ss.split(",")[1], ss -> Integer.parseInt(ss), i -> i + 70);
		convert(s, ss -> ss.split(",")[1], Integer::parseInt, i -> i + 70);

	}

	private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2,
			Function<Integer, Integer> fun3) {

//		Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
		int i = fun1.andThen(fun2).andThen(fun3).apply(s);
		System.out.println(i);
	}
}
