package xiang_106;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		String[] strArray = { "林青霞,30", "張曼玉,35", "王祖賢,33" };
//		printInfo(strArray, (String str) -> {
//			String name = str.split(",")[0];
//			System.out.print("姓名: " + name);
//		}, (String str) -> {
//			int age = Integer.parseInt(str.split(",")[1]);
//			System.out.println(",年齡: " + age);
//		});

		printInfo(strArray, str -> System.out.print("姓名: " + str.split(",")[0]),
				str -> System.out.println(",年齡: " + Integer.parseInt(str.split(",")[1])));
	}

	private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
		for (String str : strArray) {
			con1.andThen(con2).accept(str);
		}
	}
}
