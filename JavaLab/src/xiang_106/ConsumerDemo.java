package xiang_106;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
//		operatorString("林青霞", (String s) -> {
//			System.out.println(s);
//		});
		operatorString("林青霞", s -> System.out.println(s));
//		operatorString("林青霞", System.out::println);

//		operatorString("林青霞", s -> {
//			System.out.println(new StringBuilder(s).reverse().toString());
//		});
		operatorString("林青霞", s -> System.out.println(new StringBuilder(s).reverse().toString()));
		System.out.println("--------");

		operatorString("林青霞", s -> System.out.println(s),
				s -> System.out.println((new StringBuilder(s).reverse().toString())));
	}

	// 定義一個方法,用不同的方式消費同一個字符串數據兩次
	private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//		con1.accept(name);
//		con2.accept(name);
		con1.andThen(con2).accept(name);
	}

	// 定義一個方法,消費一個字符串數據
	private static void operatorString(String name, Consumer<String> con) {
		con.accept(name);
	}
}
