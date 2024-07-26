package xiang_107;

import java.util.function.Predicate;

public class PredicateDemo01 {
	public static void main(String[] args) {

//		boolean b1 = checkString("Hello", (String s) -> {
//			return s.length() > 8;
//		});
		boolean b1 = checkString("Hello", s -> s.length() > 8);
		System.out.println(b1);

		boolean b2 = checkString("helloworld", s -> s.length() > 8);
		System.out.println(b2);
	}

	// 判斷給定的字符串是否滿足要求
	private static boolean checkString(String s, Predicate<String> pre) {
//		return pre.test(s);
//		return !pre.test(s);
		return pre.negate().test(s); // 邏輯非
	}
}
