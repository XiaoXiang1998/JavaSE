package xiang_109;

import java.util.ArrayList;

public class StreamDemo04 {
	public static void main(String[] args) {
		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("linqingxia");
		list.add("zhangmanyu");
		list.add("wangzuxian");
		list.add("liuyan");
		list.add("zhangmin");
		list.add("zhangwuji");

		// 需求1:按照字母順序把數據在控制台輸出
//		list.stream().sorted().forEach(System.out::println);

		// 需求2:按照字符串長度把數據在控制台輸出
//		list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);

		list.stream().sorted((s1, s2) -> {
			int num = s1.length() - s2.length();
			int num2 = num == 0 ? s1.compareTo(s2) : num;
			return num2;
		}).forEach(System.out::println);
	}
}
