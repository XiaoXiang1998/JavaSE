package xiang_109;

import java.util.ArrayList;

public class StreamDemo06 {
	public static void main(String[] args) {
		// 創建一個集合,存儲多個字符串元素
		ArrayList<String> list = new ArrayList<String>();

		list.add("林青霞");
		list.add("張曼玉");
		list.add("王祖賢");
		list.add("柳岩");
		list.add("張敏");
		list.add("張無忌");

		// 把集合中的元素在控制台輸出
//		list.stream().forEach(System.out::println);

		// 統計集合中有幾個已張開頭的元素,在控制台輸出 count():返回此流中的元素數
		long count = list.stream().filter(s -> s.startsWith("張")).count();
		System.out.println(count);
	}
}
