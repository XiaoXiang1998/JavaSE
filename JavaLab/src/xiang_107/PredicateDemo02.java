package xiang_107;

import java.util.function.Predicate;

public class PredicateDemo02 {
	public static void main(String[] args) {

		boolean b1 = checkString("hello", s -> s.length() > 8);
		System.out.println(b1);
		boolean b2 = checkString("helloworld", s -> s.length() > 8);
		System.out.println(b2);

		boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
		System.out.println(b3);

		boolean b4 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15);
		System.out.println(b4);

	}

	// 同一個字符串給出兩個不同的判斷條件,最後把這兩個判斷的結果做邏輯與運算的結果作為最終的結果
	private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//		boolean b1 = pre1.test(s);
//		boolean b2 = pre2.test(s);
//		boolean b = b1 && b2;
//		return b;
//		return pre1.and(pre2).test(s);
		return pre1.or(pre2).test(s);
	}

	// 判斷給定的字符串是否滿足要求
	private static boolean checkString(String s, Predicate<String> pre) {
		return pre.test(s);

	}
}
