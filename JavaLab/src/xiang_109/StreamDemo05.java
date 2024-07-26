package xiang_109;

import java.util.ArrayList;

public class StreamDemo05 {
	public static void main(String[] args) {
		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");

		// 需求:將集合中的字符串數據轉換為整數之後在控制台輸出
//		list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);

//		list.stream().map(Integer::parseInt).forEach(System.out::println);

//		list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

		// int sum 返回此流元素的總和
		int result = list.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(result);
	}
}
